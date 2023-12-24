package com.guillermo.springbootwebcourse.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

    private String name;
    private String lastName;
    private String email;

    public UserModel(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}
