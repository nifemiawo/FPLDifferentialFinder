package org.com.service.impl;
import org.com.model.Goalkeeper;
import org.com.model.Player;
import org.com.service.interfaces.DifferentialCalculator;

public class GkDifferentialCalculator implements DifferentialCalculator<Goalkeeper> {

    @Override
    public double calculateScore(Goalkeeper player) {
        return (player.getCleanSheetsPer90() * 0.30) +
                (player.getSavesPer90() * 0.25) +
                (player.getPenaltiesSaved() * 0.10) +
                (player.getForm() * 0.30) +
                (player.getBps() * 0.15);
    }
}
