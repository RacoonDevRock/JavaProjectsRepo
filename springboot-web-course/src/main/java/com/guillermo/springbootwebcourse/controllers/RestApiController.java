package com.guillermo.springbootwebcourse.controllers;

import com.guillermo.springbootwebcourse.models.UserModel;
import com.guillermo.springbootwebcourse.models.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RestApiController {

//    APLICANDO AL USERDTO CREADO A UN CONTROLLER, DEFINIDO EN EL TIPO DE REPSUETSA DEL METODO Y SU RETORNO
    @GetMapping("/hello-new")
    public UserDTO hello() {
        UserDTO userDTO = new UserDTO();
        UserModel userModel = new UserModel("Guillermo","Palacios","4traffic@turo.com");
        userDTO.setUserModel(userModel);
        userDTO.setTitle("Bienvenido al API REST");
        return userDTO;
    }

    @GetMapping("/list")
    public List<UserModel> list() {
        List<UserModel> userModels = Arrays.asList(new UserModel("Guillermo","Palacios","4traffic@turo.com"),
                        new UserModel("Camila","Sanchez"),
                        new UserModel("Manguito","Copito","Capone@google.com"));
        return userModels;
    }

//    @GetMapping("/hello")
//    public Map<String,Object> hello() {
//        UserModel userModel = new UserModel("Guillermo","Palacios");
//        Map<String,Object> body = new HashMap<>();
//        body.put("titulo", "Bienvenido");
//        body.put("userModel",userModel);
//        return body;
//    }

}
