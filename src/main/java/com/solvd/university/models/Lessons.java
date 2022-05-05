package com.solvd.university.models;

import java.util.List;

public class Lessons {
    private long id;
    private int yearOfStudy;
    private int auditoryNumber;
    private List<StudentHasLessons> studentHasLesson;
    private List<Professors> professor;
    private DayOfWeek dayOfWeek;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getAuditoryNumber() {
        return auditoryNumber;
    }

    public void setAuditoryNumber(int auditoryNumber) {
        this.auditoryNumber = auditoryNumber;
    }
}
