package com.solvd.university.utilities.stax.jackson;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Player {
    @JsonProperty
    private String playerName;
    @JsonProperty
    private String playerPosition;
    @JsonProperty
    private double playerValue;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
    private Date dateOfBirth;

    public Player() {
    }

    public Player(String playerName, String playerPosition, double playerValue, Date dateOfBirth) {
        this.playerName = playerName;
        this.playerPosition = playerPosition;
        this.playerValue = playerValue;
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public double getPlayerValue() {
        return playerValue;
    }

    public void setPlayerValue(double playerValue) {
        this.playerValue = playerValue;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", playerPosition='" + playerPosition + '\'' +
                ", playerValue=" + playerValue +
                ", dateOfBirth=" + new SimpleDateFormat("dd-MM-yyyy").format(dateOfBirth)+
                '}';
    }
}
