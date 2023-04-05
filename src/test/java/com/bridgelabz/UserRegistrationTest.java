package com.bridgelabz;

import org.junit.jupiter.api.*;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    void givenFirstNameHappyTest() {
        boolean actualValue = userRegistration.validateFirstName("Pallavi");
        Assertions.assertTrue(actualValue);
        System.out.println("FirstName Successfully Validate.");
    }

    @Test
    void givenFirstNameSadTest() {
        boolean actualFirstName = userRegistration.validateFirstName("pallavis");
        Assertions.assertFalse(actualFirstName);
        System.out.println("FirstName Invalid.");
    }

    @Test
    void givenLastNameHappyTest() {
        boolean actualFirstName = userRegistration.validateLastName("Kabadi");
        Assertions.assertTrue(actualFirstName);
        System.out.println("LastName Successfully Validate.");
    }

    @Test
    void givenLastNameSadTest() {
        boolean actualLastName = userRegistration.validateLastName("kabadii");
        Assertions.assertFalse(actualLastName);
        System.out.println("LastName Invalid.");
    }

    @Test
    void givenEmailHappyTest() {
        boolean actualEmail = userRegistration.validateEmail("pallavi08jadhav@gmail.com");
        Assertions.assertTrue(actualEmail);
        System.out.println("Email Successfully Validate.");
    }

    @Test
    void givenEmailSadTest() {
        boolean actualEmail = userRegistration.validateEmail("Pallavi08Jadhav@gmailcom");
        Assertions.assertFalse(actualEmail);
        System.out.println("Email Invalid.");
    }

    @Test
    void givenMobileNumberHappyTest() {
        boolean actualMobileNumber = userRegistration.validateMobileNumber("+91 8329192312");
        Assertions.assertTrue(actualMobileNumber);
        System.out.println("Mobile Number Successfully Validate.");
    }

    @Test
    void givenMobileNumberSadTest() {
        boolean actualEmail = userRegistration.validateMobileNumber("+918229192312");
        Assertions.assertFalse(actualEmail);
        System.out.println("Mobile Number Invalid.");
    }

    @Test
    void givenPasswordHappyTest() {
        boolean actualMobileNumber = userRegistration.validatePassword("PallaviJadhav@123");
        Assertions.assertTrue(actualMobileNumber);
        System.out.println("Password Successfully Validate.");
    }

    @Test
    void givenPasswordSadTest() {
        boolean actualPassword = userRegistration.validatePassword("PallaviJadhav");
        Assertions.assertFalse(actualPassword);
        System.out.println("Password Invalid.");
    }
}
