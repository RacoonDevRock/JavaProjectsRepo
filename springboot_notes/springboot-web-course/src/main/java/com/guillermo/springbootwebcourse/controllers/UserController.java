package com.guillermo.springbootwebcourse.controllers;

import com.guillermo.springbootwebcourse.models.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {   //PROCESA PETICIONES Y RESPUESTO HACIA O DE LOS USUARIOS

    @RequestMapping(path = "/details", method = RequestMethod.GET)
    public String details(Model model) {
        UserModel userModel = new UserModel("Guillermo","Palacios","");
        model.addAttribute("titulo", "Bienvenido");
        model.addAttribute("userModel",userModel);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        model.addAttribute("titulo","La lista de usuario registrados");
        return "list";
    }

//    EN CASO SEA NECESARIO UNA LISTA EN DIVERSOS METODOS DEL CONTROLLER O VISTAS
    @ModelAttribute("userModels")
    public List<UserModel> userModelList() {
        return Arrays
                .asList(new UserModel("Guillermo","Palacios"),
                        new UserModel("Camila","Sanchez","pepito@hotmail.com"),
                        new UserModel("Manguito","Copito","Capone@google.com"));
    }

}
