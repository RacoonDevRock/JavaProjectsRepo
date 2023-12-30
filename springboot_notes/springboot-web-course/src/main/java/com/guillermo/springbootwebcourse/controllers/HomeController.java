package com.guillermo.springbootwebcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"","/","/home"})
    public String home() {
//        return "redirect:/list";
        return  "forward:/list";    // no cambia el url, ni recarga la pagina ni nada, solo cambia la vista
    }
}
