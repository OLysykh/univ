package com.solvd.university.models;

public class WandsTypes {

    private long id;
    private String wandMaterial;
    private String wandCore;
    private String wanManufacturer;
    private StudentIdCard studentIdCard;

    public long getId() {
        return id;
    }

    public String getWandMaterial() {
        return wandMaterial;
    }

    public String getWandCore() {
        return wandCore;
    }

    public String getWanManufacturer() {
        return wanManufacturer;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setWandMaterial(String wandMaterial) {
        this.wandMaterial = wandMaterial;
    }

    public void setWandCore(String wandCore) {
        this.wandCore = wandCore;
    }

    public void setWanManufacturer(String wanManufacturer) {
        this.wanManufacturer = wanManufacturer;
    }
}
