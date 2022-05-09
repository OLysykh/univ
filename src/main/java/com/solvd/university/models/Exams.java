package com.solvd.university.models;

import java.util.List;

public class Exams {

    private long id;
    private int avarageMark;
    private List<Students> student;
    private Professors professor;

    public Exams() {
    }

    public Exams(long id, int avarageMark, List<Students> student, Professors professor) {
        this.id = id;
        this.avarageMark = avarageMark;
        this.student = student;
        this.professor = professor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAvarageMark() {
        return avarageMark;
    }

    public void setAvarageMark(int avarageMark) {
        this.avarageMark = avarageMark;
    }

    public List<Students> getStudent() {
        return student;
    }

    public void setStudent(List<Students> student) {
        this.student = student;
    }

    public Professors getProfessor() {
        return professor;
    }

    public void setProfessor(Professors professor) {
        this.professor = professor;
    }
}
