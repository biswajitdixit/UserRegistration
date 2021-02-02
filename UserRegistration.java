package com.bridgelab;

import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[0-9A-Za-z]+([._+-][0-9a-zA-Z]+)*@[0-9a-zA-Z]+.[0-9a-zA-Z]{2,4}([.][a-zA-Z]{2})*$";
    private static final String MOBILE_PATTERN = "[91]+[\s]+[0-9]{10}";
    private static final String PASSWORD1_PATTERN = "[a-z A-Z 0-9]{8,}";
    private static final String PASSWORD2_PATTERN = "(?=.*?[A-Z])[a-z A-Z 0-9]{8,}";
    private static final String PASSWORD3_PATTERN = "(?=.?[A-Z])(?=.?[0-9])[a-z A-Z 0-9]{8,}";
    private static final String PASSWORD4_PATTERN = "(?=.*?[A-Z])(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{8,}$";

    public boolean validateFirstName(String FirstName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        boolean res = pattern.matcher(FirstName).matches();
        return res;

    }

    public boolean validateLastName(String LastName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        boolean res = pattern.matcher(LastName).matches();
        return res;
    }

    public boolean validateEmail(String Email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        boolean res = pattern.matcher(Email).matches();
        return res;
    }

    public boolean validateMobileNo(String MobileNo) {
        Pattern pattern = Pattern.compile(MOBILE_PATTERN);
        boolean res = pattern.matcher(MobileNo).matches();
        return res;
    }

    public boolean validatePassword1(String Password1) {
        Pattern pattern = Pattern.compile(PASSWORD1_PATTERN);
        boolean res = pattern.matcher(Password1).matches();
        return res;
    }

    public boolean validatePassword2(String Password2) {
        Pattern pattern = Pattern.compile(PASSWORD2_PATTERN);
        boolean res = pattern.matcher(Password2).matches();
        return res;
    }

    public boolean validatePassword3(String Password3) {
        Pattern pattern = Pattern.compile(PASSWORD3_PATTERN);
        boolean res = pattern.matcher(Password3).matches();
        return res;
    }

    public boolean validatePassword4(String Password4) {
        Pattern pattern = Pattern.compile(PASSWORD4_PATTERN);
        boolean res = pattern.matcher(Password4).matches();
        return res;
    }
}
