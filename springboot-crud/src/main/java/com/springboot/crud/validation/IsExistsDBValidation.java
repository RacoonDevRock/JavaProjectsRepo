package com.springboot.crud.validation;

import com.springboot.crud.services.IProductService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IsExistsDBValidation implements ConstraintValidator<IsExistsDB, String> {

    @Autowired
    private IProductService productService;

    @Override
    public boolean isValid(String string, ConstraintValidatorContext constraintValidatorContext) {
        return !productService.existsBySku(string);
    }
}
