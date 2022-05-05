package com.solvd.university.models;

public class StudentCharacteristics {

    private long id;
    private int bravery;
    private int hardWork;
    private int intelligence;
    private int ambition;
    private Students student;

    public long getId() {
        return id;
    }

    public int getBravery() {
        return bravery;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }
}
