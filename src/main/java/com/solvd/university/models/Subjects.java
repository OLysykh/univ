package com.solvd.university.models;

import java.util.List;

public class Subjects {
    private long id;
    private String subjectName;
    private List<Professors> professors;
    private List<Exams> exams;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
