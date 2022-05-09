package com.solvd.university.models;

import java.util.List;

public class Students {
    private long id;
    private long person_id;
    private String studentHouse;
    private StudentIdCard studentIdCard;
    private StudentGroups studentGroups;
    private StudentCharacteristics studentCharacteristics;
    private Persons persons;
    private List<StudentHasLessons> studentHasLessons;

    public Students() {
    }

    public Students(long id, long person_id, String studentHouse, StudentIdCard studentIdCard, StudentGroups studentGroups, StudentCharacteristics studentCharacteristics, Persons persons, List<StudentHasLessons> studentHasLessons) {
        this.id = id;
        this.person_id = person_id;
        this.studentHouse = studentHouse;
        this.studentIdCard = studentIdCard;
        this.studentGroups = studentGroups;
        this.studentCharacteristics = studentCharacteristics;
        this.persons = persons;
        this.studentHasLessons = studentHasLessons;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(long person_id) {
        this.person_id = person_id;
    }

    public String getStudentHouse() {
        return studentHouse;
    }

    public void setStudentHouse(String studentHouse) {
        this.studentHouse = studentHouse;
    }

    public StudentIdCard getStudentIdCard() {
        return studentIdCard;
    }

    public void setStudentIdCard(StudentIdCard studentIdCard) {
        this.studentIdCard = studentIdCard;
    }

    public StudentGroups getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(StudentGroups studentGroups) {
        this.studentGroups = studentGroups;
    }

    public StudentCharacteristics getStudentCharacteristics() {
        return studentCharacteristics;
    }

    public void setStudentCharacteristics(StudentCharacteristics studentCharacteristics) {
        this.studentCharacteristics = studentCharacteristics;
    }

    public Persons getPersons() {
        return persons;
    }

    public void setPersons(Persons persons) {
        this.persons = persons;
    }

    public List<StudentHasLessons> getStudentHasLessons() {
        return studentHasLessons;
    }

    public void setStudentHasLessons(List<StudentHasLessons> studentHasLessons) {
        this.studentHasLessons = studentHasLessons;
    }
}
