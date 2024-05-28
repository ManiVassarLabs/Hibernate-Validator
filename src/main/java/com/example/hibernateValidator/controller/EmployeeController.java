package com.example.hibernateValidator.controller;

import com.example.hibernateValidator.pojo.Employee;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    /*
    sample payload
    {
    "id":1,
    "name":"mani",
    "email":"manikanta3180@gmail.com",
    "mobileNumber":"3428123456"
}
     */
    @PostMapping("/test")
    public ResponseEntity<String> testing(@Valid @RequestBody Employee emp){
        System.out.println("MAXXX :: emp ::"+ emp);
        return ResponseEntity.ok("maxx is in testing for hibernate validator");
    }



}
