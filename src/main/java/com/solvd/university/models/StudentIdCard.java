package com.solvd.university.models;

public class StudentIdCard {
    private long id;
    private String materialOfWand;
    private WandsTypes wandsType;
    private Students student;

    public long getId() {
        return id;
    }

    public String getMaterialOfWand() {
        return materialOfWand;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMaterialOfWand(String materialOfWand) {
        this.materialOfWand = materialOfWand;
    }
}
