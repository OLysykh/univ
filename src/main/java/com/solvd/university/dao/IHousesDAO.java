package com.solvd.university.dao;

import com.solvd.university.models.Houses;
import com.solvd.university.models.Persons;

public interface IHousesDAO {

        Houses getHouseByID(long id);
        void saveHouse(Houses house);
        void updateHouse(Houses house);
        void removeHouse(Houses house);

}
