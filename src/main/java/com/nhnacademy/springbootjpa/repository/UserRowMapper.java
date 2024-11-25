package com.nhnacademy.springbootjpa.repository;

import com.nhnacademy.springbootjpa.domain.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
    // TODO 2 Mapper에 age 추가
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new User(
                rs.getString("id"),
                rs.getString("password"),
                rs.getInt("age")
        );
    }
}
