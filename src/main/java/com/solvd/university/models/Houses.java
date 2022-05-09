package com.solvd.university.models;

public class Houses {
    private long id;
    private int houseHead_id;
    private String houseName;
    private String houseFounder;
    private String houseAnimal;
    private String houseCommonRoom;
    private Professors professor;

    public Houses() {
    }

    public Houses(long id, int houseHead_id, String houseName, String houseFounder, String houseAnimal, String houseCommonRoom, Professors professor) {
        this.id = id;
        this.houseHead_id = houseHead_id;
        this.houseName = houseName;
        this.houseFounder = houseFounder;
        this.houseAnimal = houseAnimal;
        this.houseCommonRoom = houseCommonRoom;
        this.professor = professor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getHouseHead_id() {
        return houseHead_id;
    }

    public void setHouseHead_id(int houseHead_id) {
        this.houseHead_id = houseHead_id;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHouseFounder() {
        return houseFounder;
    }

    public void setHouseFounder(String houseFounder) {
        this.houseFounder = houseFounder;
    }

    public String getHouseAnimal() {
        return houseAnimal;
    }

    public void setHouseAnimal(String houseAnimal) {
        this.houseAnimal = houseAnimal;
    }

    public String getHouseCommonRoom() {
        return houseCommonRoom;
    }

    public void setHouseCommonRoom(String houseCommonRoom) {
        this.houseCommonRoom = houseCommonRoom;
    }

    public Professors getProfessor() {
        return professor;
    }

    public void setProfessor(Professors professor) {
        this.professor = professor;
    }
}
