package com.solvd.university.dao.jdbcMySQLImpl;

import com.solvd.university.dao.IProfessorsDAO;
import com.solvd.university.models.Professors;

import java.util.ArrayList;
import java.util.List;

public class ProfessorsDAO extends ForAllDAO implements IProfessorsDAO {


    public Professors getProfessorByID(long id) {
        return null;
    }

    public void removeProfessor(Professors professor) {

    }

    public void updateProfessor(Professors professor) {

    }

    public void saveProfessor(Professors professor) {

    }

//    public List<Professors> getHouseHeads(){
//        List<Professors> profList  =new ArrayList<>();
//        try {
//            getResultSet("SELECT professors.academicDegree, persons.personName, persons.personSurrname,houses.houseName,houseCommonRoom FROM professors INNER JOIN persons ON professors.person_id = persons.id RIGHT JOIN houses ON professors.id = houseHead_id");
//        while (resultSet.next()){
//            Professors prof = new Professors();
//            prof.setAcademicDegree(resultSet.getString("academicDegree"));
//            prof.setPersonName(resultSet.getString("personName"));
//            prof.setPersonSurname(resultSet.getString("personSurrname"));
//            prof.setHouse(resultSet.getString("houseName"));
//            prof.(resultSet.getString("houseName"));
//        }
//        }
//    }
}
