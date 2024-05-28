package com.example.hibernateValidator.pojo;


import com.example.hibernateValidator.validataion.ContactNumberConstraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Employee {

    @NotNull(message = "id can't be null")
    private int id;

    @Size(min = 2 ,max = 30 ,message = "name must be between 2 to 30 letters")
    private String name;

    @Email(message = "email should be valid")
    @NotNull(message = "email can't be null")
    private String email;

    //custom constarint
    @ContactNumberConstraint
    private String mobileNumber;

    public Employee(int id, String name, String email,String mobileNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber ;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber ='" + mobileNumber + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
