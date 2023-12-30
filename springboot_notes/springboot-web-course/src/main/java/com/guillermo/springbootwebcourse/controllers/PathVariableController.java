package com.guillermo.springbootwebcourse.controllers;

import com.guillermo.springbootwebcourse.models.UserModel;
import com.guillermo.springbootwebcourse.models.dto.ParamDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/var")
public class PathVariableController {

    @Value("${token.auth}")
    private String usertoken;

    @Value("${nombre.auth}")
    private String nombreAuth;

    @Autowired
    private Environment env;

    @GetMapping("/test/{message}")  // la ruta de variable es obligatoria
    public ParamDTO test(@PathVariable String message) {
        ParamDTO paramDTO = new ParamDTO();
        paramDTO.setMessage(message);
        return paramDTO;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String,Object> mixPathVar(@PathVariable String product, @PathVariable Long id) {
        Map<String,Object> json = new HashMap<>();
        json.put("product",product);
        json.put("id",id);
        return json;
    }

    @PostMapping("/create")
    public UserModel create(@RequestBody UserModel userModel) {
        userModel.setName(userModel.getName().toLowerCase());
        return userModel;
    }

    @GetMapping("/values")
    public Map<String, Object> value(@Value("${number.auth}") String numberAuth) {
        Map<String,Object> json = new HashMap<>();
        json.put("usertoken", usertoken);
        json.put("numberAuth", Integer.parseInt(numberAuth));
        json.put("nombreAuth", nombreAuth);
        json.put("message", env.getProperty("nombre.auth"));
        json.put("numberAuth2", env.getProperty("number.auth", Integer.class));

        return json;
    }

}
