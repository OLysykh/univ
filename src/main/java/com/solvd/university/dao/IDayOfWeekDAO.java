package com.solvd.university.dao;

import com.solvd.university.models.DayOfWeek;
import com.solvd.university.models.Houses;

public interface IDayOfWeekDAO {

    DayOfWeek getDayOfWeekByID(long id);
    void saveDayOfWeek(DayOfWeek dayOfWeek);
    void updateDayOfWeek(DayOfWeek dayOfWeek);
    void removeDayOfWeek(DayOfWeek dayOfWeek);
}
