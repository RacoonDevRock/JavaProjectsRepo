package com.spring.security.services;

import com.spring.security.persistence.entities.UserEntity;
import com.spring.security.services.models.dto.LoginDTO;
import com.spring.security.services.models.dto.ResponseDTO;

import java.util.HashMap;

public interface IAuthService {
    HashMap<String, String> login(LoginDTO loginDTO) throws Exception;
    ResponseDTO register(UserEntity user) throws Exception;
}
