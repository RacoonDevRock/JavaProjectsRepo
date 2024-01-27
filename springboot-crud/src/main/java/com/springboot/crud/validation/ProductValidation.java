package com.springboot.crud.validation;

import com.springboot.crud.entities.Product;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class ProductValidation implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Product.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Product product = (Product) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"name",null,"es requerido!");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"description",null,"NotBlank.product.description");
        if (product.getDescription() == null || product.getDescription().isBlank()) {
            errors.rejectValue("description",null,"es requerido, desc!");
        }

        if (product.getPrice() == null || product.getPrice() < 500) {
            errors.rejectValue("price",null,"no nulo!");
        }
    }
}
