package org.com.service.interfaces;

import org.com.model.Player;

public interface DifferentialCalculator<T extends Player> {

    double calculateScore(T player);
}
