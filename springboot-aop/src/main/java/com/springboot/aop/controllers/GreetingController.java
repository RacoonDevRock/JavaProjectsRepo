package com.springboot.aop.controllers;

import com.springboot.aop.services.IGreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/greeting")
@RequiredArgsConstructor
public class GreetingController {
    private final IGreetingService greetingService;

    @GetMapping
    public ResponseEntity<?> greeting() {
        return ResponseEntity.ok(Collections.singletonMap("greeting ", greetingService.sayHello("Joe","Has muerto")));
    }

    @GetMapping("/error")
    public ResponseEntity<?> greetingError() {
        return ResponseEntity.ok(Collections.singletonMap("greeting ", greetingService.sayHelloError("Joe","Has muerto")));
    }
}
