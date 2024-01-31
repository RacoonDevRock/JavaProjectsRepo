package com.springboot.crud.services;

import com.springboot.crud.entities.UserEntity;

import java.util.List;

public interface IUserService {
    List<UserEntity> findAll();
    UserEntity save(UserEntity userEntity);
    boolean existsByUsername(String username);
}
