package com.ideas.app.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class PruebaController {
    //UN CONTROLADOR POSEE METODOS DE ACCION O HANDLER, MANEJA PETICION HTTP DEL USER

//    EJEMPLO DE METODO, CADA METODO MANEJA UNA PETICIÓN HTTP DISTINTA
//    MAPEO 1ERA FORMA
//    @RequestMapping(value = "/home", method = RequestMethod.GET) // NECESARIO MAPEAR PARA IDENTIFICAR EL METODO A UNA RUTA URL
                                                                    // GET POR DEFECTO AL NO IDENTIFICAR QUE TIPO DE PETICION ES
//    2DA FORMA
    @GetMapping("/prueba") // UNA O VARIA RUTAS
    public String prueba(Model model, ModelMap modelMap, Map<String,Object> map) {
        // pasar datos del controlador a la vista - model asigna datos o valores
        // MODEL Y MODELMAP son lo mismo
        modelMap.addAttribute("titulo","hola amigos");
        // con la misma clase de java de clave-valor, igual se puede aplicar
//        map.put("nombre","guillermo's");

        return "prueba";
    }

//    @GetMapping({"/home","/","/index"})
//    public ModelAndView home1(ModelAndView modelAndView) { // de esta forma asignamos la vista a cargar
//        // otra forma
//        modelAndView.addObject("apellido","sanchez's"); // es posible asignar el nombre d ela vista a cargar
//        modelAndView.setViewName("home");
//        return modelAndView;
//    }


}
