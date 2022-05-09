package com.solvd.university.models;

public class StudentHasLessons {
    private long id;
    private long student_id;
    private long lesson_id;

    public StudentHasLessons() {
    }

    public StudentHasLessons(long id, long student_id, long lesson_id) {
        this.id = id;
        this.student_id = student_id;
        this.lesson_id = lesson_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(long student_id) {
        this.student_id = student_id;
    }

    public long getLesson_id() {
        return lesson_id;
    }

    public void setLesson_id(long lesson_id) {
        this.lesson_id = lesson_id;
    }
}
