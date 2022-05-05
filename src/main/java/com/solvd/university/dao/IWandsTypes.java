package com.solvd.university.dao;

import com.solvd.university.models.WandsTypes;

public interface IWandsTypes {

    WandsTypes getStudentByID(long id);
    void saveWandType(WandsTypes wandType);
    void updateWandType(WandsTypes wandType);
    void removeWandType(WandsTypes wandType);
}
