package com.example;

public class Main {
    public static void main(String[] args) throws InvalidUserDetailsException, InvalidDataException {

        User user = new User("Raghav", "Patidar",
                "abc.xyz@bl.co.in", "91 9977649723",
                "@R1qweqa");
        System.out.println(user);

        String[] correctEmail = {
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.co",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.a",
                "abc@1.com",
                "abc@gmail.com.co",
                "abc+100@gmail.co",
        };

        String[] incorrectEmail = {
                "abc",
                "abc@.com.my",
                "abc123@gmail.a ",
                "abc123@.com ",
                "abc123@.com.com",
                ".abc@abc.com ",
                "abc()*@gmail.com ",
                "abc@%*.com ",
                "abc..2002@gmail.com ",
                "abc.@gmail.com ",
                "abc@abc@gmail.com",
                "abc@gmail.com.1a",
                "abc@gmail.com.aa.au",
        };
        Validator validator = new Validator();
        for (String email : correctEmail) {
            if (validator.validateEmail(email)) {
                System.out.println("email: " + email + " --> correct");
            } else {
                System.out.println("email: " + email + " --> incorrect");
            }
        }
        System.out.println();
        for (String email : incorrectEmail) {
            if (validator.validateEmail(email)) {
                System.out.println("email: " + email + " --> correct");
            } else {
                System.out.println("email: " + email + " --> incorrect");
            }
        }
    }
}
