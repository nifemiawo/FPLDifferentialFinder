package org.com.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.com.model.*;
import org.com.service.interfaces.FplApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;

@Service
public class FplApiServiceImpl implements FplApiService {

    private static final String FPL_API_URL = "https://fantasy.premierleague.com/api/bootstrap-static/";
    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;
    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(FplApiServiceImpl.class);


    public FplApiServiceImpl() {
        this.restTemplate = new RestTemplate();
        this.objectMapper = new ObjectMapper();
    }

    @Override
    @Cacheable("goalkeepers")
    public List<Goalkeeper> getAllGoalkeepers() {
        logger.info("Fetching goalkeepers from FPL API");
        return getPlayersByPosition(1, Goalkeeper.class);
    }

    @Override
    @Cacheable("defenders")
    public List<Defender> getAllDefenders() {
        logger.info("Fetching defenders from FPL API");
        return getPlayersByPosition(2, Defender.class);
    }

    @Override
    @Cacheable("midfielders")
    public List<Midfielder> getAllMidfielders() {
        logger.info("Fetching midfielders from FPL API");
        return getPlayersByPosition(3, Midfielder.class);
    }


    @Override
    @Cacheable("forwards")
    public List<Forward> getAllForwards() {
        logger.info("Fetching forwards from FPL API");
        return getPlayersByPosition(4, Forward.class);
    }

    private <T extends Player> List<T> getPlayersByPosition(int elementType, Class<T> clazz) {
        try {
            String response = restTemplate.getForObject(FPL_API_URL, String.class);
            JsonNode root = objectMapper.readTree(response);
            JsonNode elements = root.get("elements");

            List<T> players = new ArrayList<>();
            for (JsonNode node : elements) {
                if (node.get("element_type").asInt() == elementType) {
                    T player = objectMapper.treeToValue(node, clazz);
                    players.add(player);
                }
            }
            logger.info("Fetched {} players of type {}", players.size(), clazz.getSimpleName());
            return players;
        } catch (Exception e) {
            logger.error("Error fetching players from FPL API", e);
            return new ArrayList<>();
        }
    }


}
