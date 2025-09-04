package org.com.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forward extends Player {
    @JsonProperty("goals_scored")
    private int goalsScored;

    @JsonProperty("assists")
    private int assists;

    @JsonProperty("expected_goals")
    private double expectedGoals;

    @JsonProperty("expected_assists")
    private double expectedAssists;

    @JsonProperty("expected_goal_involvements")
    private double expectedGoalInvolvements;

    @JsonProperty("threat")
    private double threat;

    @JsonProperty("ict_index")
    private double ictIndex;

    @JsonProperty("bonus")
    private int bonus;

    @JsonProperty("bps")
    private int bps;

    public Forward(int id, String firstName, String secondName, String webName, int team, int nowCost, double form,
                   double pointsPerGame, int totalPoints, double selectedByPercent, String status, int minutes, int starts,
                   String birthDate, int elementType, int goalsScored, int assists, double expectedGoals,
                   double expectedAssists, double expectedGoalInvolvements, double threat, double ictIndex, int bonus,
                   int bps) {
        super(id, firstName, secondName, webName, team, nowCost, form, pointsPerGame, totalPoints,
                selectedByPercent, status, minutes, starts, birthDate, elementType);
        this.goalsScored = goalsScored;
        this.assists = assists;
        this.expectedGoals = expectedGoals;
        this.expectedAssists = expectedAssists;
        this.expectedGoalInvolvements = expectedGoalInvolvements;
        this.threat = threat;
        this.ictIndex = ictIndex;
        this.bonus = bonus;
        this.bps = bps;
    }

    public Forward() {
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

    public double getThreat() {
        return threat;
    }

    public void setThreat(double threat) {
        this.threat = threat;
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
