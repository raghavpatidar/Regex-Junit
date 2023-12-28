package com.example;

import java.util.regex.Pattern;

public class Validator {

    public boolean validateName(String name) {
        Pattern pattern = Pattern.compile("^[A-Z].{2,}$");
        boolean matcher = pattern.matcher(name).matches();
        if (!matcher)
            System.out.println("First latter should be Capital with minimum 3 latters ");

        return true;
    }

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern
                .compile("^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z]+(?:\\.[a-zA-Z]+)*(?:\\.[a-zA-Z]{2,})$");
        boolean matcher = pattern.matcher(email).matches();
        if (!matcher)
            System.out.println("Email format is incorrect");

        return true;
    }

    public boolean validatePhone(String phone) {
        Pattern pattern = Pattern.compile("^[0-9]+\\s[0-9]{10}$");
        boolean matcher = pattern.matcher(phone).matches();
        if (!matcher)
            System.out.println("Phone format is incorrect");

        return matcher;
    }

    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(".{8,}");
        boolean matcher = pattern.matcher(password).matches();
        if (!matcher)
            System.out.println("Email format is incorrect");

        return matcher;
    }
}
