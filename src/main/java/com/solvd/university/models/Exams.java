package com.solvd.university.models;

import java.util.List;

public class Exams {

    private long id;
    private int avarageMark;
    private List<Students> student;
    private Professors professor;

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
}
