package com.example;

// import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    String firstName;
    String lastName;

    User(String firstName, String lastName) {
        if (!validate(firstName, lastName)) {
            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("User created successfully : " + this.toString());
    }

    private boolean validate(String firstName, String lastName) {
        Pattern pattern = Pattern.compile("^[A-Z].{2,}$");
        boolean matcher = pattern.matcher(firstName).matches();
        if (!matcher) {
            System.out.println("First latter should be Capital with minimum 3 latters ");
            return false;
        }

        matcher = pattern.matcher(lastName).matches();
        if (!matcher) {
            System.out.println("Last latter should be Capital with minimum 3 latters ");
            return false;
        }
        System.out.println(matcher);
        return true;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + ", lastName: " + lastName;
    }

}
