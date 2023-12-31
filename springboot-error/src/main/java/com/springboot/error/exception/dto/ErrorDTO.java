package com.springboot.error.exception.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDTO {
    private String message;
    private String error;
    private int status;
    private Date date;
}
