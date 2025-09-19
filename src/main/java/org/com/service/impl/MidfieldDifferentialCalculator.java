package org.com.service.impl;

import org.com.model.Midfielder;
import org.com.model.Player;
import org.com.service.interfaces.DifferentialCalculator;

public class MidfieldDifferentialCalculator implements DifferentialCalculator<Midfielder> {
    @Override
    public double calculateScore(Midfielder player) {
        return (player.getExpectedGoalInvolvements() * 0.35) +
                (player.getCreativity() * 0.25) +
                (player.getDefensiveContribution() * 0.15) +
                (player.getForm() * 0.15) +
                (player.getBps() * 0.10);
    }
}
