package com.spring.security.services.impl;

import com.spring.security.persistence.entities.UserEntity;
import com.spring.security.persistence.repositories.UserRepository;
import com.spring.security.services.IAuthService;
import com.spring.security.services.IJwtUtilityService;
import com.spring.security.services.models.dto.LoginDTO;
import com.spring.security.services.models.dto.ResponseDTO;
import com.spring.security.services.models.validations.UserValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
//La razón de la sintaxis extraña es hacer que esta característica funcione en los
// compiladores javac 7; el @__tipo es una referencia de anotación al tipo de anotación
// __(doble guión bajo) que en realidad no existe; esto hace que javac 7 retrase la
// cancelación del proceso de compilación debido a un error porque es posible que un
// procesador de anotaciones cree el __tipo más adelante.
public class AuthServiceImpl implements IAuthService {
    private final UserRepository userRepository;
    private final IJwtUtilityService jwtUtilityService;
    private final UserValidation userValidation;

    @Autowired
    public AuthServiceImpl(UserRepository userRepository, IJwtUtilityService jwtUtilityService, UserValidation userValidation) {
        this.userRepository = userRepository;
        this.jwtUtilityService = jwtUtilityService;
        this.userValidation = userValidation;
    }

    @Override
    public HashMap<String, String> login(LoginDTO loginDTO) throws Exception {
        try {
            HashMap<String, String> jwt = new HashMap<>();
            Optional<UserEntity> entityOptional = userRepository.findByEmail(loginDTO.getEmail());

            if (entityOptional.isEmpty()) {
                jwt.put("error", "User not registered...");
                return jwt;
            }

//            Verify password
            if (verifyPassword(loginDTO.getPassword(), entityOptional.get().getPassword())) {
                jwt.put("jwt", jwtUtilityService.generateJWT(entityOptional.get().getUserId()));
            } else {
                jwt.put("error", "Authentication failed");
            }

            return jwt;
        } catch (Exception e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public ResponseDTO register(UserEntity user) throws Exception {
        try {
            ResponseDTO responseDTO = userValidation.validate(user);

            if (responseDTO.getNumOfErrors() > 0) {
                return responseDTO;
            }

            List<UserEntity> getAllUsers = userRepository.findAll();

            for (UserEntity repeatFields : getAllUsers) {
                if (repeatFields != null) {
                    responseDTO.setNumOfErrors(1);
                    responseDTO.setMessage("User already exists...");
                    return responseDTO;
                }
            }

            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
            user.setPassword(encoder.encode(user.getPassword()));
            userRepository.save(user);
            responseDTO.setMessage("User created successfully...");

            return responseDTO;

        } catch (Exception e) {
            throw new Exception(e.toString());
        }
    }

    private boolean verifyPassword(String enteredPassword, String storedPassword) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.matches(enteredPassword, storedPassword);
    }

}

