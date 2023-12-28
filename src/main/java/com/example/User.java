package com.example;

public class User {
    String firstName;
    String lastName;
    String email;
    String phone;
    String password;

    User(String firstName, String lastName, String email, String phone, String password) {
        if (!validate(firstName, lastName, email, phone, password)) {

            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        System.out.println("User created successfully : " + this.toString());
    }

    private boolean validate(String firstName, String lastName, String email, String phone, String password) {
        Validator validator = new Validator();
        return validator.validateName(firstName) && validator.validateName(lastName) && validator.validateEmail(email)
                && validator.validatePhone(phone) && validator.validatePassword(password);
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + ", lastName: " + lastName
                + ", email: " + email + ", Phone: " + phone
                + ", Password: " + password;
    }

}
