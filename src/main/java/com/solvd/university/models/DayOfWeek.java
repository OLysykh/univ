package com.solvd.university.models;

public class DayOfWeek {

    private long id;
    private String dayOfWeek;
    private Lessons lessons;

    public DayOfWeek() {
    }

    public DayOfWeek(long id, String dayOfWeek, Lessons lessons) {
        this.id = id;
        this.dayOfWeek = dayOfWeek;
        this.lessons = lessons;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Lessons getLessons() {
        return lessons;
    }

    public void setLessons(Lessons lessons) {
        this.lessons = lessons;
    }
}
