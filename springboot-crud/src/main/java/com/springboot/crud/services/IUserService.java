package com.springboot.crud.services;

import com.springboot.crud.entities.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    User save(User user);
}
