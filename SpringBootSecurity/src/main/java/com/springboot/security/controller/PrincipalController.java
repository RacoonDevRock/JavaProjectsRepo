package com.springboot.security.controller;

import com.springboot.security.controller.dto.CreateUserDTO;
import com.springboot.security.entity.ERole;
import com.springboot.security.entity.RoleEntity;
import com.springboot.security.entity.UserEntity;
import com.springboot.security.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/proof")
public class PrincipalController {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    @Autowired
    public PrincipalController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/unsecured")
    public String helloNoSecured() {
        return "Public endpoint ";
    }

    @GetMapping("/secured")
    public String helloSecured() {
        return "Private endpoint";
    }

    @PostMapping("/createUser")
    public ResponseEntity<?> createUser(@Valid @RequestBody CreateUserDTO createUserDTO) {
        Set<RoleEntity> roleEntities = createUserDTO
                .getRoles()
                .stream()
                .map(role -> RoleEntity.builder()
                        .name(ERole.valueOf(role))
                        .build())
                .collect(Collectors.toSet());

        UserEntity userEntity = UserEntity.builder()
                .username(createUserDTO.getUsername())
                .email(createUserDTO.getEmail())
                .password(passwordEncoder.encode(createUserDTO.getPassword()))
                .roleEntities(roleEntities)
                .build();

        userRepository.save(userEntity);

        return ResponseEntity.ok(userEntity);
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(@RequestParam String userId) {
        userRepository.deleteById(Long.parseLong(userId));
        return "Se ha eliminado el user con el ID: ".concat(userId);
    }

}
