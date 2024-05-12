package com.nhnacademy.springbootjpa.repository;

import com.nhnacademy.springbootjpa.domain.User;

public interface UserRepository {
    boolean exists(String id);

    boolean matches(String id, String password);

    User getById(String id);

    boolean create(String id, String password);

    boolean modifyById(String id, String password);
}
