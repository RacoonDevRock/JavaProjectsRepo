package com.springboot.crud.controllers;

import com.springboot.crud.entities.User;
import com.springboot.crud.services.IUserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final IUserService userService;

    @GetMapping
    public List<User> listUsers() {
        return userService.findAll();
    }

    @PostMapping
    public ResponseEntity<?> saveUser(@Valid @RequestBody User user, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return validation(bindingResult);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
    }

    private ResponseEntity<Map<String, String>> validation(BindingResult bindingResult) {
        Map<String, String> errorValidate = new HashMap<>();
        bindingResult.getFieldErrors().forEach(fieldError -> {
            errorValidate.put(fieldError.getField(), "El campo " + fieldError.getField() + " " + fieldError.getDefaultMessage());
        });
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorValidate);
    }
}
