package com.example;

public class User {
    String firstName;
    String lastName;
    String email;
    String phone;
    String password;

    User(String firstName, String lastName, String email, String phone, String password)
            throws InvalidUserDetailsException, InvalidDataException {
        validate(firstName, lastName, email, phone, password);

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        System.out.println("User created successfully : " + this.toString());
    }

    private void validate(String firstName, String lastName, String email, String phone, String password)
            throws InvalidUserDetailsException, InvalidDataException {
        Validator validator = new Validator();

        if (!validator.validateName(firstName)) {
            throw new InvalidUserDetailsException("Invalid first name");
        }

        if (!validator.validateName(lastName)) {
            throw new InvalidUserDetailsException("Invalid last name");
        }

        if (!validator.validateEmail(email)) {
            throw new InvalidUserDetailsException("Invalid email");
        }

        if (!validator.validatePhone(phone)) {
            throw new InvalidUserDetailsException("Invalid phone number");
        }

        if (!validator.validatePassword(password)) {
            throw new InvalidUserDetailsException("Invalid password");
        }
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + ", lastName: " + lastName + ", email: " + email + ", Phone: " + phone
                + ", Password: " + password;
    }
}