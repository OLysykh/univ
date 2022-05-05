package com.solvd.university.models;

public class DayOfWeek {

    private long id;
    private String dayOfWeek;
    private Lessons lessons;

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


}
