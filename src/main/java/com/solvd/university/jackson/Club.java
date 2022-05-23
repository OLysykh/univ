package com.solvd.university.jackson;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Club {
    @JsonProperty
    private String name;
    @JsonProperty
    private String city;
    @JsonProperty
    private String nickName;
    @JsonProperty
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy")
    private GregorianCalendar foundationDate;
    @JsonProperty
    private int stadiumCapacity;
    @JsonProperty
    List<Player> players;

    public Club() {
    }

    public Club(String name, String city, String nickName, GregorianCalendar foundationDate, int stadiumCapacity, List<Player> players) {
        this.name = name;
        this.city = city;
        this.nickName = nickName;
        this.foundationDate = foundationDate;
        this.stadiumCapacity = stadiumCapacity;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public GregorianCalendar getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(GregorianCalendar foundationDate) {
        this.foundationDate = foundationDate;
    }

    public int getStadiumCapacity() {
        return stadiumCapacity;
    }

    public void setStadiumCapacity(int stadiumCapacity) {
        this.stadiumCapacity = stadiumCapacity;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Club{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nickName='" + nickName + '\'' +
                ", foundationDate=" + foundationDate.get(Calendar.YEAR) +
                ", stadiumCapacity=" + stadiumCapacity +
                '}';
    }
}
