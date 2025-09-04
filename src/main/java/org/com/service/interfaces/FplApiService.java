package org.com.service.interfaces;

import org.com.model.Defender;
import org.com.model.Forward;
import org.com.model.Goalkeeper;
import org.com.model.Midfielder;

import java.util.List;

public interface FplApiService {
    List<Goalkeeper> getAllGoalkeepers();
    List<Forward> getAllForwards();
    List<Midfielder> getAllMidfielders();
    List<Defender> getAllDefenders();
}
