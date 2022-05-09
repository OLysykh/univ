package com.solvd.university.models;

public class StudentCharacteristics {

    private long id;
    private long student_id;
    private int bravery;
    private int hardWork;
    private int intelligence;
    private int ambition;
    private Students student;

    public StudentCharacteristics() {
    }

    public StudentCharacteristics(long id, long student_id, int bravery, int hardWork, int intelligence, int ambition, Students student) {
        this.id = id;
        this.student_id = student_id;
        this.bravery = bravery;
        this.hardWork = hardWork;
        this.intelligence = intelligence;
        this.ambition = ambition;
        this.student = student;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(long student_id) {
        this.student_id = student_id;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }
}
