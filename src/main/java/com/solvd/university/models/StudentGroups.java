package com.solvd.university.models;

import java.util.List;

public class StudentGroups {
    private long id;
    private int studentQuantity;
    private int yearOfStudy;
    private List <Students> students;

    public long getId() {
        return id;
    }

    public int getStudentQuantity() {
        return studentQuantity;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setStudentQuantity(int studentQuantity) {
        this.studentQuantity = studentQuantity;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
}
