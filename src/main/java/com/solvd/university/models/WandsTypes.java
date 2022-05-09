package com.solvd.university.models;

public class WandsTypes {

    private long id;
    private String wandMaterial;
    private String wandCore;
    private String wanManufacturer;
    private StudentIdCard studentIdCard;

    public WandsTypes() {
    }

    public WandsTypes(long id, String wandMaterial, String wandCore, String wanManufacturer, StudentIdCard studentIdCard) {
        this.id = id;
        this.wandMaterial = wandMaterial;
        this.wandCore = wandCore;
        this.wanManufacturer = wanManufacturer;
        this.studentIdCard = studentIdCard;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWandMaterial() {
        return wandMaterial;
    }

    public void setWandMaterial(String wandMaterial) {
        this.wandMaterial = wandMaterial;
    }

    public String getWandCore() {
        return wandCore;
    }

    public void setWandCore(String wandCore) {
        this.wandCore = wandCore;
    }

    public String getWanManufacturer() {
        return wanManufacturer;
    }

    public void setWanManufacturer(String wanManufacturer) {
        this.wanManufacturer = wanManufacturer;
    }

    public StudentIdCard getStudentIdCard() {
        return studentIdCard;
    }

    public void setStudentIdCard(StudentIdCard studentIdCard) {
        this.studentIdCard = studentIdCard;
    }
}
