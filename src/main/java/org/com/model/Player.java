package org.com.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Player {
    @JsonProperty("id")
    private int id;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("second_name")
    private String secondName;

    @JsonProperty("web_name")
    private String webName;

    @JsonProperty("team")
    private int team;

    @JsonProperty("now_cost")
    private int nowCost;

    @JsonProperty("form")
    private double form;

    @JsonProperty("points_per_game")
    private double pointsPerGame;

    @JsonProperty("total_points")
    private int totalPoints;

    @JsonProperty("selected_by_percent")
    private double selectedByPercent;

    @JsonProperty("status")
    private String status;

    @JsonProperty("minutes")
    private int minutes;

    @JsonProperty("starts")
    private int starts;

    @JsonProperty("birth_date")
    private String birthDate;

    @JsonProperty("element_type")
    private int elementType;


    public Player(int id, String firstName, String secondName, String webName, int team, int nowCost, double form,
                  double pointsPerGame, int totalPoints, double selectedByPercent, String status, int minutes, int starts,
                  String birthDate, int elementType) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.webName = webName;
        this.team = team;
        this.nowCost = nowCost;
        this.form = form;
        this.pointsPerGame = pointsPerGame;
        this.totalPoints = totalPoints;
        this.selectedByPercent = selectedByPercent;
        this.status = status;
        this.minutes = minutes;
        this.starts = starts;
        this.birthDate = birthDate;
        this.elementType = elementType;
    }

    public Player() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getWebName() {
        return webName;
    }

    public void setWebName(String webName) {
        this.webName = webName;
    }

    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public int getNowCost() {
        return nowCost;
    }

    public void setNowCost(int nowCost) {
        this.nowCost = nowCost;
    }

    public double getForm() {
        return form;
    }

    public void setForm(double form) {
        this.form = form;
    }

    public double getPointsPerGame() {
        return pointsPerGame;
    }

    public void setPointsPerGame(double pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public double getSelectedByPercent() {
        return selectedByPercent;
    }

    public void setSelectedByPercent(double selectedByPercent) {
        this.selectedByPercent = selectedByPercent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getStarts() {
        return starts;
    }

    public void setStarts(int starts) {
        this.starts = starts;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getElementType() {
        return elementType;
    }

    public void setElementType(int elementType) {
        this.elementType = elementType;
    }


}