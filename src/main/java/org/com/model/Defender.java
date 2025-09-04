package org.com.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Defender extends Player {

    @JsonProperty("goals_scored")
    private int goalsScored;

    @JsonProperty("assists")
    private int assists;

    @JsonProperty("clean_sheets")
    private int cleanSheets;

    @JsonProperty("expected_goals")
    private double expectedGoals;

    @JsonProperty("expected_assists")
    private double expectedAssists;

    @JsonProperty("expected_goal_involvements")
    private double expectedGoalInvolvements;

    @JsonProperty("creativity")
    private double creativity;

    @JsonProperty("expected_goals_conceded")
    private double expectedGoalsConceded;

    @JsonProperty("ict_index")
    private double ictIndex;

    @JsonProperty("bonus")
    private int bonus;

    @JsonProperty("bps")
    private int bps;

    @JsonProperty("defensive_contribution")
    private double defensiveContribution;

    public Defender(
            int goalsScored, int assists, int cleanSheets, double expectedGoals, double expectedAssists,
            double expectedGoalInvolvements, double creativity, double expectedGoalsConceded,
            double ictIndex, int bonus, int bps, double defensiveContribution) {

        this.goalsScored = goalsScored;
        this.assists = assists;
        this.cleanSheets = cleanSheets;
        this.expectedGoals = expectedGoals;
        this.expectedAssists = expectedAssists;
        this.expectedGoalInvolvements = expectedGoalInvolvements;
        this.creativity = creativity;
        this.expectedGoalsConceded = expectedGoalsConceded;
        this.ictIndex = ictIndex;
        this.bonus = bonus;
        this.bps = bps;
        this.defensiveContribution = defensiveContribution;
    }


    public Defender() {
        super();
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getCleanSheets() {
        return cleanSheets;
    }

    public void setCleanSheets(int cleanSheets) {
        this.cleanSheets = cleanSheets;
    }

    public double getExpectedGoals() {
        return expectedGoals;
    }

    public void setExpectedGoals(double expectedGoals) {
        this.expectedGoals = expectedGoals;
    }

    public double getExpectedAssists() {
        return expectedAssists;
    }

    public void setExpectedAssists(double expectedAssists) {
        this.expectedAssists = expectedAssists;
    }

    public double getExpectedGoalInvolvements() {
        return expectedGoalInvolvements;
    }

    public void setExpectedGoalInvolvements(double expectedGoalInvolvements) {
        this.expectedGoalInvolvements = expectedGoalInvolvements;
    }

    public double getCreativity() {
        return creativity;
    }

    public void setCreativity(double creativity) {
        this.creativity = creativity;
    }

    public double getExpectedGoalsConceded() {
        return expectedGoalsConceded;
    }

    public void setExpectedGoalsConceded(double expectedGoalsConceded) {
        this.expectedGoalsConceded = expectedGoalsConceded;
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

    public double getDefensiveContribution() {
        return defensiveContribution;
    }

    public void setDefensiveContribution(double defensiveContribution) {
        this.defensiveContribution = defensiveContribution;
    }

}
