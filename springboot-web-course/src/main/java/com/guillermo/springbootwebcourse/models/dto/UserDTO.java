package com.guillermo.springbootwebcourse.models.dto;

import com.guillermo.springbootwebcourse.models.UserModel;
import lombok.Data;

@Data
public class UserDTO {  // OBJETO SIMPLE DE JAVA COMO UN POJO
    private String title;
    private UserModel userModel;
}
