package org.com.service.impl;

import org.com.model.Defender;
import org.com.service.interfaces.DifferentialCalculator;

public class DefDifferentialCalculator implements DifferentialCalculator<Defender> {
    @Override
    public double calculateScore(Defender player) {
        return (player.getCleanSheets() * 0.25) +
                ((1.0 / (1.0 + player.getExpectedGoalsConceded())) * 0.20) + // better if fewer expected goals conceded
                (player.getExpectedGoalInvolvements() * 0.20) +
                (player.getDefensiveContribution() * 0.30) +
                (player.getForm() * 0.10) +
                (player.getBps() * 0.05);
    }
}
