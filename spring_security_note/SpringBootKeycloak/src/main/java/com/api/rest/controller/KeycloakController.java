package com.api.rest.controller;

import com.api.rest.dto.UserDTO;
import com.api.rest.service.IKeycloakService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/keycloak/user")
@PreAuthorize("hasRole('admin_client_role')")   // SOLO LOS ADMINISTRADORES PODRAN GESTIONAR CRUD LOS USUARIOS
@RequiredArgsConstructor
public class KeycloakController {

    @Autowired
    private IKeycloakService iKeycloakService;

    @GetMapping("/search")
    public ResponseEntity<?> findAllUsers() {
        return ResponseEntity.ok(iKeycloakService.findAllUsers());
    }

    @GetMapping("/search/{username}")
    public ResponseEntity<?> findUserByUsername(@PathVariable String username) {
        return ResponseEntity.ok(iKeycloakService.searchUserByUsername(username));
    }

    @PostMapping("/create")
    public ResponseEntity<?> createUser(@RequestBody UserDTO userDTO) throws URISyntaxException {
        String response = iKeycloakService.createUser(userDTO);
        return ResponseEntity.created(new URI("/keycloak/user/create")).body(userDTO);
    }

    @PutMapping("/update/{userId}")
    public ResponseEntity<?> updateUser(@PathVariable String userId, @RequestBody UserDTO userDTO) {
        iKeycloakService.updateUser(userId,userDTO);
        return ResponseEntity.ok("User updated successfully!");
    }

    @DeleteMapping("/delete/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable String userId) {
        iKeycloakService.deleteUser(userId);
        return ResponseEntity.noContent().build();
    }

}
