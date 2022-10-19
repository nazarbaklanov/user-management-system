package com.example.usermanagementsystem.lib;

import com.example.usermanagementsystem.model.Status;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StatusValidator implements ConstraintValidator<ValidStatus, String> {
    @Override
    public boolean isValid(String status, ConstraintValidatorContext constraintValidatorContext) {
        if (status == null) {
            return false;
        }
        try {
            Status.valueOf(status);
        } catch (IllegalArgumentException e) {
            return false;
        }
        return true;
    }
}
