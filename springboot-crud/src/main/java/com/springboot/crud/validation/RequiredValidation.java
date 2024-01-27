package com.springboot.crud.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.util.StringUtils;

public class RequiredValidation implements ConstraintValidator<IsRequired, String> {
    @Override
    public boolean isValid(String string, ConstraintValidatorContext constraintValidatorContext) {
//        return string != null && !string.isEmpty() && !string.isBlank(); //OPTION 1
        return StringUtils.hasText(string); //OPTION 2
    }
}
