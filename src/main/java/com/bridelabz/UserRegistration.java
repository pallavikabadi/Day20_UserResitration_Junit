package com.bridelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean checkFirstName(String userFirstName) throws InvalidUserException {
        Pattern firstName = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher = firstName.matcher(userFirstName);
        if (matcher.matches()) {
            return true;
        } else {

            throw new InvalidUserException("Invalid First Name");
        }
    }

    public boolean checkLastName(String userLastName) throws InvalidUserException {
        Pattern lastName = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher = lastName.matcher(userLastName);
        if (matcher.matches()) {
            return true;
        } else {
            throw new InvalidUserException("Invalid Last Name");
        }
    }

    public boolean checkMobileNumber(String userMobileNumber) throws InvalidUserException {
        Pattern mobileNumber = Pattern.compile("^[0-9]{2,}[0-9]{10,}$");
        Matcher matcher = mobileNumber.matcher(userMobileNumber);
        if (matcher.matches()) {
            return true;
        } else {
            throw new InvalidUserException("Invalid Mobile Number");
        }
    }

    public boolean checkPassword(String userPassword) throws InvalidUserException {
        Pattern passwordRule = Pattern.compile("^(?=.*[A-Z])(?=.*[!@#$%&*()])(?=.*[0-9])(?=\\S+$).{8,}$");
        Matcher matcher = passwordRule.matcher(userPassword);
        if (matcher.matches()) {
            return true;
        } else {
            throw new InvalidUserException("Invalid Password");
        }
    }

    public boolean checkEmail(String userEmailId) throws InvalidUserException {
        Pattern emailPattern = Pattern.compile("^[a-z0-9]{3,}([+-._]{1}[0-9]+)?@[a-z0-9]+[.]{1}[a-z]{2,}[,]?([.]{1}[a-z]{1,})?$");
        Matcher matcher = emailPattern.matcher(userEmailId);
        if (matcher.matches()) {
            return true;
        } else {
            throw new InvalidUserException("Invalid Email ID");
        }
    }
}
