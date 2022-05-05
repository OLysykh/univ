package com.solvd.university.models;

public class Houses {
    private String id;
    private String houseName;
    private String houseFounder;
    private String houseAnimal;
    private String houseCommonRoom;
    private Professors professor;

    public String getId() {
        return id;
    }

    public String getHouseName() {
        return houseName;
    }

    public String getHouseFounder() {
        return houseFounder;
    }

    public String getHouseAnimal() {
        return houseAnimal;
    }

    public String getHouseCommonRoom() {
        return houseCommonRoom;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public void setHouseFounder(String houseFounder) {
        this.houseFounder = houseFounder;
    }

    public void setHouseAnimal(String houseAnimal) {
        this.houseAnimal = houseAnimal;
    }

    public void setHouseCommonRoom(String houseCommonRoom) {
        this.houseCommonRoom = houseCommonRoom;
    }
}
