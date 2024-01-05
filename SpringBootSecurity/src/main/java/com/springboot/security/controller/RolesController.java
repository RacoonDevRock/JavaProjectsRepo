package com.springboot.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roles")
public class RolesController {

    @GetMapping("/accessAdmin")
    @PreAuthorize("hasRole('ADMIN')")
    public String accessAdmin() {
        return "Hey, ADMIN..";
    }

    @GetMapping("/accessUser")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public String accessUser() {
        return "Hey, USER..";
    }

    @GetMapping("/accessInvited")
    @PreAuthorize("hasAnyRole('INVITED', 'USER', 'ADMIN')")
    public String accessInvited() {
        return "Hey, INVITED..";
    }
}
