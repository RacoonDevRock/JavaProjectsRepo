package com.calendar.interceptor.springbootinterceptorhorario.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/app")
public class AppController {

    @GetMapping("/attention")
    public ResponseEntity<?> attention(HttpServletRequest request) {
        Map<String, Object> response = new HashMap<>();
        response.put("title", "Welcome to the system...");
        response.put("time", new Date());
        response.put("message", request.getAttribute("message"));
        return ResponseEntity.ok(response);
    }



}
