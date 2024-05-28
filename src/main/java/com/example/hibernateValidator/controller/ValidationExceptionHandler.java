package com.example.hibernateValidator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
public class ValidationExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>> handleValidationsExceptions(MethodArgumentNotValidException ex){
        Map<String,String> res = new HashMap<>();
            ex.getBindingResult().getAllErrors().forEach((error)->{
                String errorMessage = error.getDefaultMessage();
                res.put("error",errorMessage);
            });
         return  new ResponseEntity<>(res,HttpStatus.BAD_REQUEST);
    }
}
