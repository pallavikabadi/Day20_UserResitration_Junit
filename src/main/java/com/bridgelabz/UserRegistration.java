package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Pattern firstName= Pattern.compile("^[A-Z][a-z]{3,}$");
    static Pattern lastName= Pattern.compile("^[A-Z][a-z]{3,}$");
    static Pattern emailId = Pattern.compile("^[a-z0-9]*[.]?[a-z0-9]*(@[a-z]{5}[.][a-z]{3})$");
    static Pattern mobileNumber = Pattern.compile("^[0-9]{2,}[0-9]{10,}$");
    static Pattern passwordRule1 = Pattern.compile("^[a-z]{8,}$");
    static Pattern passwordRule2 = Pattern.compile("^[A-Za-z]{8,}$");
    static Pattern passwordRule3 = Pattern.compile("^(?=[a-z]*[A-Z])(?=.*[0-9]).{8,}$");
    static Pattern passwordRule4 = Pattern.compile("^(?=[a-z]*[A-Z])(?=.*[0-9])(?=.*[\\\\W_]).{8,}$");

    public boolean validateFirstName(String name) {

        Matcher matcher = firstName.matcher(name);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validateLastName(String name) {

        Matcher matcher= lastName.matcher(name);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validateEmail(String eMail) {

        Matcher matcher = emailId.matcher(eMail);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validateMobileNumber(String number) {

        Matcher matcher = mobileNumber.matcher(number);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validatePassword(String password) {

        Matcher matcher = passwordRule4.matcher(password);
        if (matcher.matches())
            return true;
        else
            return false;
    }
}
