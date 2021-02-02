
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstNameValid() {
        boolean result = true;
        result = userRegistration.validateFirstName.validate("Biswa");
        Assert.assertTrue(result);
    }



    @Test
    public void givenLastNameValid() {
        boolean result = true;
        result = userRegistration.validateLastName.validate("Dixit");
        Assert.assertTrue(result);
    }



    @Test
    public void givenEmailValid() {
        boolean result = true;
        result = userRegistration.validateEmail.validate("biswajitdixit7991@gmail.com");
        Assert.assertTrue(result);
    }



    @Test
    public void givenMobileNoValid() {
        boolean result = true;
        result = userRegistration.validateMobile.validate("91 9437726849");
        Assert.assertTrue(result);
    }


    @Test
    public void givenPasswordValid() {
        boolean result = true;
        result = userRegistration.validatePassword.validate("A1@12g449");
        Assert.assertTrue(result);
    }

}

