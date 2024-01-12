package com.api.rest.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class TestController {

    @GetMapping("/admin")
    @PreAuthorize("hasRole('admin_client_role')")
    public String helloAdmin() {
        return "Hello Admin... in SpringBoot Keycloak";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('user_client_role') or hasRole('admin_client_role')")    // user_client_role/admin_client_role no reconoce estos
                                                                                    // roles debido a la sintaxis necesario ya que debe poseer _ROLE
                                                                                    // por ello debe crearse un convertidor/clase, para buscar roles
                                                                                    // en el token JwtAuthenticationConverter.class
    public String helloUser() {
        return "Hello User... in SpringBoot Keycloak";
    }

}
