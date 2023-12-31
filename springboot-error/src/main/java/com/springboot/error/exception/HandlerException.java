package com.springboot.error.exception;

import com.springboot.error.exception.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.Date;

@RestControllerAdvice
public class HandlerException {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<ErrorDTO> arithmeticException(Exception e) {
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setDate(new Date());
        errorDTO.setError("Error division");
        errorDTO.setMessage(e.getMessage());
        errorDTO.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .body(errorDTO);
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<ErrorDTO> notFoundException(NoHandlerFoundException e) {
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setDate(new Date());
        errorDTO.setError("API REST not founded");
        errorDTO.setMessage(e.getMessage());
        errorDTO.setStatus(HttpStatus.NOT_FOUND.value());
        return ResponseEntity.status(HttpStatus.NOT_FOUND.value())
                .body(errorDTO);
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<ErrorDTO> numberFormatException(NumberFormatException e) {
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setDate(new Date());
        errorDTO.setError("NO PUEDE TRANSFORMA UN STRING A INTEGER");
        errorDTO.setMessage(e.getMessage());
        errorDTO.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .body(errorDTO);
    }

}
