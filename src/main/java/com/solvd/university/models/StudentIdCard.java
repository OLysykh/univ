package com.solvd.university.models;

public class StudentIdCard {
    private long id;
    private long studentsId;
    private String materialOfWand;
    private WandsTypes wandsType;
    private Students student;

    public StudentIdCard() {
    }

    public StudentIdCard(long id, long studentsId, String materialOfWand, WandsTypes wandsType, Students student) {
        this.id = id;
        this.studentsId = studentsId;
        this.materialOfWand = materialOfWand;
        this.wandsType = wandsType;
        this.student = student;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getStudentsId() {
        return studentsId;
    }

    public void setStudentsId(long studentsId) {
        this.studentsId = studentsId;
    }

    public String getMaterialOfWand() {
        return materialOfWand;
    }

    public void setMaterialOfWand(String materialOfWand) {
        this.materialOfWand = materialOfWand;
    }

    public WandsTypes getWandsType() {
        return wandsType;
    }

    public void setWandsType(WandsTypes wandsType) {
        this.wandsType = wandsType;
    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }
}
