package org.com.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Goalkeeper extends Player {
    @JsonProperty("saves")
    private int saves;

    @JsonProperty("clean_sheets")
    private int cleanSheets;

    @JsonProperty("goals_conceded")
    private int goalsConceded;

    @JsonProperty("penalties_saved")
    private int penaltiesSaved;

    @JsonProperty("saves_per_90")
    private double savesPer90;

    @JsonProperty("clean_sheets_per_90")
    private double cleanSheetsPer90;

    @JsonProperty("ict_index")
    private double ictIndex;

    @JsonProperty("bonus")
    private int bonus;

    @JsonProperty("bps")
    private int bps;


    public Goalkeeper(int id, String firstName, String secondName, String webName, int team, int nowCost, double form,
                      double pointsPerGame, int totalPoints, double selectedByPercent, String status, int minutes, int starts,
                      String birthDate, int elementType, int saves, int cleanSheets, int goalsConceded, int penaltiesSaved,
                      double savesPer90, double cleanSheetsPer90, double ictIndex, int bonus, int bps) {
        super(id, firstName, secondName, webName, team, nowCost, form, pointsPerGame, totalPoints,
                selectedByPercent, status, minutes, starts, birthDate, elementType);
        this.saves = saves;
        this.cleanSheets = cleanSheets;
        this.goalsConceded = goalsConceded;
        this.penaltiesSaved = penaltiesSaved;
        this.savesPer90 = savesPer90;
        this.cleanSheetsPer90 = cleanSheetsPer90;
        this.ictIndex = ictIndex;
        this.bonus = bonus;
        this.bps = bps;
    }

    public Goalkeeper() {
        super();
    }

    public int getSaves() {
        return saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }

    public int getCleanSheets() {
        return cleanSheets;
    }

    public void setCleanSheets(int cleanSheets) {
        this.cleanSheets = cleanSheets;
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(int goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    public int getPenaltiesSaved() {
        return penaltiesSaved;
    }

    public void setPenaltiesSaved(int penaltiesSaved) {
        this.penaltiesSaved = penaltiesSaved;
    }

    public double getSavesPer90() {
        return savesPer90;
    }

    public void setSavesPer90(double savesPer90) {
        this.savesPer90 = savesPer90;
    }

    public double getCleanSheetsPer90() {
        return cleanSheetsPer90;
    }

    public void setCleanSheetsPer90(double cleanSheetsPer90) {
        this.cleanSheetsPer90 = cleanSheetsPer90;
    }

    public double getIctIndex() {
        return ictIndex;
    }

    public void setIctIndex(double ictIndex) {
        this.ictIndex = ictIndex;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBps() {
        return bps;
    }

    public void setBps(int bps) {
        this.bps = bps;
    }


}

