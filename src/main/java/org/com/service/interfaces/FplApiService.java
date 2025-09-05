package org.com.service.interfaces;

import org.com.model.*;

import java.util.List;

public interface FplApiService {
    List<Goalkeeper> getAllGoalkeepers();
    List<Forward> getAllForwards();
    List<Midfielder> getAllMidfielders();
    List<Defender> getAllDefenders();
    List<Player> getUserTeam(int id);

}
