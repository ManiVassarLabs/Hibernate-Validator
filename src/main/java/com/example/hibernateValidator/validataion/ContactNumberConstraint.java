package com.example.hibernateValidator.validataion;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD,ElementType.PARAMETER}) // this annatation is used to specify that the contact number constarint should verify whenever it is a field or paramete
@Retention(RetentionPolicy.RUNTIME) // this annatation is used to specify when this should work
@Constraint(validatedBy = ContactNumberValidator.class)
public @interface ContactNumberConstraint {
    public String message() default "Invalid phone number, please check the mobile number again ";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
