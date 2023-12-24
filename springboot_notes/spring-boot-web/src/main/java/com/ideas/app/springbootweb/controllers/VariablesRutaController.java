package com.ideas.app.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class VariablesRutaController {

    @GetMapping("/string/{texto}") // hacer uso de variable cuadno un tramo de la ruta es una variable impuesta
    public String variables(@PathVariable String texto, Model model){
        model.addAttribute("titulo", "Recibir parametros de la ruta (PATH VARIABLE)");
        model.addAttribute("resultado", "El texto enviado en la ruta es: " + texto);
        return "variables/ver";

    }

}
