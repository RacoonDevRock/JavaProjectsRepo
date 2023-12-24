package com.ideas.app.springbootweb.controllers;

import com.ideas.app.springbootweb.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/app") // ruta de primer nivel o ruta raiz/base
public class HomeController {

    @GetMapping({"/home","/"})  // ruta de segundo nivel
    public String home(Model model) {
        model.addAttribute("titulo","Iniciamos contigo");
        return "home";
    }

    @GetMapping("/perfil")
    public String perfil(Model model) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Isla");
        usuario.setApellido("Dynamo");
        usuario.setEmail("dynamersoon@gmail.com");

        model.addAttribute("usuario",usuario);
        model.addAttribute("titulo","Perfil de usuario: ".concat(usuario.getNombre()));  //concatenacion de cadenas

        return "perfil";
    }

//    primera forma de pasar datos a la vista con model attribute, pasando la lista
//    si tenemos un objeto o una lista de usuario solo usandose en el listas esta forma es adecuada(solo esta)
//    @GetMapping("/listar")
//    public String listar(Model model) {
//        List<Usuario> usuarios = Arrays
//                .asList(new Usuario("Andrea","Barte","roula@hotmail.com"),
//                        new Usuario("Lubo","Mia","beretta@outlook.com"),
//                        new Usuario("Parse","Aras","rapastre@google.com"));
//
//        model.addAttribute("titulo","Listado de usuarios");
//        model.addAttribute("usuarios", usuarios);
//
//        return "listar";
//    }


//    otra forma de pasar datos a la vista con model attribute, pasando la lista
//    si necesitamos usarlo en diversas listas o metodos, mejor extraerlo
    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("titulo","Listado de usuarios");
        return "listar";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> usuarioList() { // pretende poblar los datoss d eusuarios
        List<Usuario> usuarios = Arrays
                .asList(new Usuario("Andrea","Barte","roula@hotmail.com"),
                        new Usuario("Lubo","Mia","beretta@outlook.com"),
                        new Usuario("Parse","Aras","rapastre@google.com"));
        return usuarios;
    }
}
