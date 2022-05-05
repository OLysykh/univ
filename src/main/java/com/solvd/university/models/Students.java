package com.solvd.university.models;

import java.util.List;

public class Students {
    private long id;
    private String studentHouse;
    private StudentIdCard studentIdCard;
    private StudentGroups studentGroups;
    private StudentCharacteristics studentCharacteristics;
    private Persons persons;
    private List<StudentHasLessons> studentHasLessons;

    public long getId() {
        return id;
    }

    public String getStudentHouse() {
        return studentHouse;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setStudentHouse(String studentHouse) {
        this.studentHouse = studentHouse;
    }
}
