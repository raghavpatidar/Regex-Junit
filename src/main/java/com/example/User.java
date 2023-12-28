package com.example;

// import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    String firstName;
    String lastName;
    String email;
    String phone;

    User(String firstName, String lastName, String email, String phone) {
        if (!validate(firstName, lastName, email, phone)) {

            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        System.out.println("User created successfully : " + this.toString());
    }

    private boolean validate(String firstName, String lastName, String email, String phone) {
        Validator validator = new Validator();
        return validator.validateName(firstName) && validator.validateName(lastName) && validator.validateEmail(email)
                && validator.validatePhone(phone);
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + ", lastName: " + lastName + ", email: " + email + ", Phone:" + phone;
    }

}
