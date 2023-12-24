package com.guillermo.springbootwebcourse.controllers;

import com.guillermo.springbootwebcourse.models.dto.ParamDTO;
import com.guillermo.springbootwebcourse.models.dto.ParamMixDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/params")
public class RequestParamsController {

//    DATOS DE TIPO PRIMITIVO CON LOS REQUEST PARAM

    @GetMapping("/foo")
    public ParamDTO foo(@RequestParam(name = "saludo", required = false,defaultValue = "hola manguito") String message) {
        ParamDTO paramDTO = new ParamDTO();
        paramDTO.setMessage(message);
        return paramDTO;
    }

    @GetMapping("/bar")
    public ParamMixDTO bar(@RequestParam String text, @RequestParam Integer code) {
        ParamMixDTO params = new ParamMixDTO();
        params.setMessage(text);
        params.setCode(code);
        return params;
    }

    @GetMapping("/request")
    public ParamMixDTO request(HttpServletRequest request) {
        ParamMixDTO params= new ParamMixDTO();
        params.setCode(Integer.parseInt(request.getParameter("code")));
        params.setMessage(request.getParameter("message"));
        return params;
    }

}
