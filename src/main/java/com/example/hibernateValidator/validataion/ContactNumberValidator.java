package com.example.hibernateValidator.validataion;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ContactNumberValidator implements ConstraintValidator<ContactNumberConstraint,String> {
    @Override
    public boolean isValid(String mobileNumber, ConstraintValidatorContext constraintValidatorContext) {
        if(mobileNumber==null || mobileNumber.isEmpty()){
            return false;
        }
        return mobileNumber.length()==10 && mobileNumber.matches("[0-9]+");
    }
}
