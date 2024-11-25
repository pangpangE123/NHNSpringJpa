package com.nhnacademy.springbootjpa.repository;

import com.nhnacademy.springbootjpa.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Objects;

@RequiredArgsConstructor
@Repository
public class UserRepositoryImpl implements UserRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public boolean exists(String id) {
        Integer count = jdbcTemplate.queryForObject("select count(*) from `user` where id = ?1", Integer.class, id);
        return count != null && count == 1;
    }

    @Override
    public boolean matches(String id, String password) {
        User user = jdbcTemplate.queryForObject(
                "select id, password from `user` where id = ?1 and password = ?2",
                User.class,
                id,
                password
        );
        return Objects.nonNull(user) && user.getId().equals(id);
    }

    // TODO 4 쿼리 수정
    @Override
    public User getById(String id) {
        return jdbcTemplate.queryForObject(
                "select id, password, age from `user` where id = ?1",
                new UserRowMapper(),
                id
        );
    }

    // TODO 4 쿼리 수정
    @Override
    public boolean create(String id, String password,int age) {
        int result = jdbcTemplate.update(
                "insert into `user` (id, password, age) values (?, ?, ?)",
                id,
                password,
                age
        );
        return result == 1;
    }

    @Override
    public boolean modifyById(String id, String password) {
        int result = jdbcTemplate.update(
                "update `user` set password = ?1 where id = ?2",
                password,
                id
        );
        return result == 1;
    }

}
