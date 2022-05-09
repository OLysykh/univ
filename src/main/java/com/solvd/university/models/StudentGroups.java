package com.solvd.university.models;

import java.util.List;

public class StudentGroups {
    private long id;
    private int studentQuantity;
    private int yearOfStudy;
    private List <Students> students;

    public StudentGroups() {
    }

    public StudentGroups(long id, int studentQuantity, int yearOfStudy, List<Students> students) {
        this.id = id;
        this.studentQuantity = studentQuantity;
        this.yearOfStudy = yearOfStudy;
        this.students = students;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getStudentQuantity() {
        return studentQuantity;
    }

    public void setStudentQuantity(int studentQuantity) {
        this.studentQuantity = studentQuantity;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }
}
