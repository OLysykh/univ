package com.solvd.university.dao;


import com.solvd.university.models.Professors;

public interface IProfessorsDAO {

    Professors getProfessorByID(long id);
    void saveProfessor(Professors professor);
    void updateProfessor(Professors professor);
    void removeProfessor(Professors professor);

}
