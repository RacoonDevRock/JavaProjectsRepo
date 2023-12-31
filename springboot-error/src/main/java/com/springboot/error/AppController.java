package com.springboot.error;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppController {

    @GetMapping("/")
    public String index() {
        int value = 100/0;
        return "200 OK";
    }

    @GetMapping("/home")
    public String home() {
        int value = Integer.parseInt("10x");
        return "200 OK";
    }

}
