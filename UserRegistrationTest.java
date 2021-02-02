package com.bridgelab;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration=new UserRegistration();
    @Test
    public void givenFirstNameHappy(){
        boolean result=userRegistration.validateFirstName("Biswa");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstNameSad(){
        boolean result=userRegistration.validatePassword4("biswa");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastNameHappy(){
        boolean result=userRegistration.validateLastName("Dixit");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastNameSad(){
        boolean result=userRegistration.validateLastName("dixit");
        Assert.assertFalse(result);
    }
    @Test
    public void givenEmailHappy(){
        boolean result=userRegistration.validateEmail("biswajitdixit@gmail.com");
        Assert.assertTrue(result);
    }
    @Test
    public void givenEmailSad(){
        boolean result=userRegistration.validateEmail("biswajitdixitgmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNoHappy(){
        boolean result=userRegistration.validateMobileNo("91 9437726849");
        Assert.assertTrue(result);
    }
    @Test
    public void givenMobileNoSad(){
        boolean result=userRegistration.validateMobileNo("9437726849");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPasswordOneHappy(){
        boolean result=userRegistration.validatePassword1("abcdbd12");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPasswordOneSad(){
        boolean result=userRegistration.validatePassword1("andkk");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPasswordTwoHappy(){
        boolean result=userRegistration.validatePassword2("Aabdhtfgh");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPasswordTwoSad(){
        boolean result=userRegistration.validatePassword2("acgsjdjd");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPasswordThreeHappy(){
        boolean result =userRegistration.validatePassword3("1Ajjsvcjshg");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPasswordThreeSad(){
        boolean result=userRegistration.validatePassword3("Aggdvhfdsf");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPasswordFourHappy(){
        boolean result=userRegistration.validatePassword4("@A1hbkdbaa");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPasswordFourSad(){
        boolean result=userRegistration.validatePassword4("hjvjadjh");
        Assert.assertFalse(result);
    }
}
