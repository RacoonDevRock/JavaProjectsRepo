package com.springboot.crud.validation;

import com.springboot.crud.repositories.UserRepository;
import com.springboot.crud.services.IUserService;
import com.springboot.crud.services.impl.UserServiceImpl;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ExistsByUsernameValidation implements ConstraintValidator<ExistsByUsername, String> {
    private final IUserService userService;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        if (userService == null) {
            return true;
        }
                return !userService.existsByUsername(username);
    }
}
