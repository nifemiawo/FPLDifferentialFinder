package org.com.service.impl;

import org.com.model.Forward;
import org.com.service.interfaces.DifferentialCalculator;

public class ForwardDifferentialCalculator implements DifferentialCalculator<Forward> {
    @Override
    public double calculateScore(Forward player) {
        return (player.getExpectedGoalInvolvements() * 0.40) +
                (player.getThreat() * 0.30) +
                (player.getForm() * 0.20) +
                (player.getBps() * 0.10);
    }
}
