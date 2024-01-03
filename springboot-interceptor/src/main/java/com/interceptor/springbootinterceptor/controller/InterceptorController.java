package com.interceptor.springbootinterceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class InterceptorController {

    @GetMapping("/loading")
    public Map<String, String> loading() {
        return Collections.singletonMap("message","handler loading del controlador");
    }

    @GetMapping("/time")
    public Map<String, String> time() {
        return Collections.singletonMap("message","handler time del controlador");
    }

    @GetMapping("/interceptor")
    public Map<String, String> interceptor() {
        return Collections.singletonMap("message","handler interceptor del controlador");
    }

}
