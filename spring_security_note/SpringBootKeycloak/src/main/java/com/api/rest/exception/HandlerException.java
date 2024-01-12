package com.api.rest.exception;

import com.api.rest.exception.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.nio.file.AccessDeniedException;
import java.util.Date;

@RestControllerAdvice
public class HandlerException {

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<ErrorDTO> accessDeniedException(AccessDeniedException e) {
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setTimestamp(new Date());
        errorDTO.setStatus(errorDTO.getStatus());
        errorDTO.setError(errorDTO.getError());
        return ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .body(errorDTO);
    }

}
