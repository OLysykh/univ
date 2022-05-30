package com.solvd.university.models;

import java.util.List;

public class Students extends Persons {
    private long id;
    private long person_id;
    private long exams_id;
    private long groups_id;
    private String studentHouse;
    private StudentIdCard studentIdCard;
    private StudentGroups studentGroups;
    private StudentCharacteristics studentCharacteristics;
    private Persons persons;
    private List<StudentHasLessons> studentHasLessons;
    private List<Persons> personsWhoAreStudents;


    public Students() {
    }


    public Students(long id, String studentHouse) {
        this.id = id;
        this.studentHouse = studentHouse;
    }

    public Students(long person_id, String studentHouse, long groups_id) {
        this.person_id = person_id;
        this.groups_id = groups_id;
        this.studentHouse = studentHouse;
    }

    public Students(long id, long person_id, String studentHouse, StudentIdCard studentIdCard, StudentGroups studentGroups, StudentCharacteristics studentCharacteristics, Persons persons, List<StudentHasLessons> studentHasLessons) {
        this.id = id;
        this.person_id = person_id;
        this.studentHouse = studentHouse;
        this.studentIdCard = studentIdCard;
        this.studentGroups = studentGroups;
        this.studentCharacteristics = studentCharacteristics;
        this.persons = persons;
        this.studentHasLessons = studentHasLessons;
    }


    public List<Persons> getPersonsWhoAreStudents() {
        return personsWhoAreStudents;
    }

    public void setPersonsWhoAreStudents(List<Persons> personsWhoAreStudents) {
        this.personsWhoAreStudents = personsWhoAreStudents;
    }

    public Students(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(long person_id) {
        this.person_id = person_id;
    }

    public String getStudentHouse() {
        return studentHouse;
    }

    public void setStudentHouse(String studentHouse) {
        this.studentHouse = studentHouse;
    }

    public StudentIdCard getStudentIdCard() {
        return studentIdCard;
    }

    public void setStudentIdCard(StudentIdCard studentIdCard) {
        this.studentIdCard = studentIdCard;
    }

    public StudentGroups getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(StudentGroups studentGroups) {
        this.studentGroups = studentGroups;
    }

    public StudentCharacteristics getStudentCharacteristics() {
        return studentCharacteristics;
    }

    public void setStudentCharacteristics(StudentCharacteristics studentCharacteristics) {
        this.studentCharacteristics = studentCharacteristics;
    }

    public Persons getPersons() {
        return persons;
    }

    public void setPersons(Persons persons) {
        this.persons = persons;
    }

    public List<StudentHasLessons> getStudentHasLessons() {
        return studentHasLessons;
    }

    public void setStudentHasLessons(List<StudentHasLessons> studentHasLessons) {
        this.studentHasLessons = studentHasLessons;
    }

    public long getExams_id() {
        return exams_id;
    }

    public void setExams_id(long exams_id) {
        this.exams_id = exams_id;
    }

    public long getGroups_id() {
        return groups_id;
    }

    public void setGroups_id(long groups_id) {
        this.groups_id = groups_id;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", person_id=" + person_id +
                ", exams_id=" + exams_id +
                ", groups_id=" + groups_id +
                ", studentHouse='" + studentHouse + '\'' +
                ", studentIdCard=" + studentIdCard +
                ", studentGroups=" + studentGroups +
                ", studentCharacteristics=" + studentCharacteristics +
                ", persons=" + persons +
                ", studentHasLessons=" + studentHasLessons +
                '}';
    }
}
