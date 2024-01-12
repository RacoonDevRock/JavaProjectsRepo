package com.spring.security.services.models.validations;

import com.spring.security.persistence.entities.UserEntity;
import com.spring.security.services.models.dto.ResponseDTO;

public class UserValidation {
    public ResponseDTO validate(UserEntity user) {
        ResponseDTO responseDTO = new ResponseDTO();

        responseDTO.setNumOfErrors(0);

        if (user.getFirstName() == null || user.getFirstName().length() < 3 || user.getFirstName().length() > 15) {
            responseDTO.setNumOfErrors(responseDTO.getNumOfErrors() + 1);
            responseDTO.setMessage("The firstName field cannot be null, it must also be between 15 and 3 characters long");
        }

        if (user.getLastName() == null || user.getLastName().length() < 3 || user.getLastName().length() > 30) {
            responseDTO.setNumOfErrors(responseDTO.getNumOfErrors() + 1);
            responseDTO.setMessage("The lastName field cannot be null, it must also be between 30 and 3 characters long");
        }

        if (user.getEmail() == null || !user.getEmail().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            responseDTO.setNumOfErrors(responseDTO.getNumOfErrors() + 1);
            responseDTO.setMessage("The email field is not valid");
        }

        if (user.getPassword() == null || !user.getPassword().matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,16}$")) {
            responseDTO.setNumOfErrors(responseDTO.getNumOfErrors() + 1);
            responseDTO.setMessage("The password must be between 8 and 16 characters, at least one number, one lower case and one upper case.");
        }

        return responseDTO;
    }
}
