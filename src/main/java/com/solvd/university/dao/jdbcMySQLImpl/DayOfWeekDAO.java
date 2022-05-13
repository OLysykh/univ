package com.solvd.university.dao.jdbcMySQLImpl;

import com.solvd.university.dao.IDayOfWeekDAO;
import com.solvd.university.models.DayOfWeek;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DayOfWeekDAO extends AbstractDAO implements IDayOfWeekDAO {

    public DayOfWeek getDayOfWeekByID(long id) {
        DayOfWeek dayOfWeek = new DayOfWeek();
        try {
            PreparedStatement pr = getPreparedStatement("SELECT * FROM dayofweek WHERE id = ?");
            pr.setLong(1, id);
            ResultSet rs = pr.executeQuery();
            rs.next();
            dayOfWeek.setId(rs.getLong("id"));
            dayOfWeek.setDayOfWeek(rs.getString("dayOfWeek"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
        return dayOfWeek;
    }

    public void saveDayOfWeek(DayOfWeek dayOfWeek) {
        try {
            PreparedStatement pr = getPreparedStatement("INSERT INTO dayofweek (dayOfWeek) VALUES (?)");
            pr.setString(1, dayOfWeek.getDayOfWeek());
            pr.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
    }

    public void updateDayOfWeek(DayOfWeek dayOfWeek) {
        try {
            PreparedStatement pr = getPreparedStatement("UPDATE dayofweek SET  dayOfWeek = ? WHERE id = ?");
            pr.setString(1, dayOfWeek.getDayOfWeek());
            pr.setLong(2, dayOfWeek.getId());
            pr.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
    }

    public void removeDayOfWeek(DayOfWeek dayOfWeek) {
        try {
            PreparedStatement pr = getPreparedStatement("DELETE FROM dayofweek WHERE id = ?");
            pr.setLong(1, dayOfWeek.getId());
            pr.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
    }
}