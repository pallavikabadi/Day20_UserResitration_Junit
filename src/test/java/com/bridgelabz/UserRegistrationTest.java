package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class UserRegistrationTest {
    UserRegistration userRegistration ;
    @Before
    public void initialize(){
        userRegistration = new UserRegistration();
    }
    String emailId;
    public UserRegistrationTest(String emailId){
        super();
        this.emailId = emailId;
    }
    @Test
    public void firstNameHappyTest(){
        boolean firstName = userRegistration.validateFirstName("Pallavi");
        Assert.assertEquals(true,firstName);
    }
    @Test
    public void firstNameSadTest(){
        boolean firstName = userRegistration.validateFirstName("pallavis");
        Assert.assertFalse(firstName);
    }
    @Test
    public void LastNameHappyTest(){
        boolean lastName = userRegistration.validateLastName("Kabadi");
        Assert.assertTrue(lastName);
    }
    @Test
    public void LastNameSadTest(){
        boolean lastName = userRegistration.validateLastName("kabadii");
        Assert.assertFalse(lastName);
    }
    @Test
    public void phoneNumberHappyTest(){
        boolean phoneNumber = userRegistration.validateMobileNumber("+91 8329192312");
        Assert.assertTrue(phoneNumber);
    }
    @Test
    public void phoneNumberSadTest(){
        boolean phoneNumber = userRegistration.validateMobileNumber("918229192312");
        Assert.assertFalse(phoneNumber);
    }
    @Test
    public void passwordHappyTest(){
        boolean password = userRegistration.validatePassword("pallavi@123");
        Assert.assertTrue(password);
    }
    @Test
    public void passwordSadTest(){
        boolean password = userRegistration.validatePassword("pallavi");
        Assert.assertFalse(password);
    }
    @Test
    public void emailHappyTest(){
        boolean email = userRegistration.validateEmail("pallavi08jadhav@gmail.com");
        Assert.assertTrue(email);
    }
    @Test
    public void emailSadTest(){
        boolean email = userRegistration.validateEmail("Pallavi08Jadhav@gmail.com");
        Assert.assertFalse(email);
    }

    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList( new String[] {"abc@yahoo.com","abc.100@abc.com.au","abc@1.com","abc+100@gmail.com","abc.100@yahoo.com","abc-100@abc.net","abc-100@yahoo.com","abc111@abc.com"});
    }
    @Test
    public void checkEmailWithMultipleInputs(){
        Assert.assertEquals(true,userRegistration.validateEmail(emailId));
    }
}
