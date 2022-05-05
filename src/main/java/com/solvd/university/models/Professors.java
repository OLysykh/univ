package com.solvd.university.models;

public class Professors {
    private long id;
    private long salary;
    private String academicDegree;
    private Persons person;
    private Houses house;
    private Exams exam;


    public long getId() {
        return id;
    }

    public long getSalary() {
        return salary;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }
}
