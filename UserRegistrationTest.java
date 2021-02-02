
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void givenFirstNameValid() {
        boolean result = true;
        try {
            result = userRegistration.validateFirstName("Biswa");
        } catch (UserRegistrationException e) {

            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstNameInvalid() {
        boolean result = false;
        try {
            result = userRegistration.validateFirstName("bisw");
        } catch (UserRegistrationException e) {

            e.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastNameValid() {
        boolean result = true;
        try {
            result = userRegistration.validateLastName("Dixit");
        } catch (UserRegistrationException e) {

            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastNameInvalid() {
        boolean result = false;
        try {
            result = userRegistration.validateLastName("Dix");
        } catch (UserRegistrationException e) {

            e.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailValid() {
        boolean result = true;
        try {
            result = userRegistration.validateEmail("biswajitdixit7991@gmail.com");
        } catch (UserRegistrationException e) {

            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailInvalid() {
        boolean result = false;
        try {
            result = userRegistration.validateEmail("biswajitdixi");
        } catch (UserRegistrationException e) {

            e.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNoValid() {
        boolean result = true;
        try {
            result = userRegistration.validateMobileNo("91 9437726849");
        } catch (UserRegistrationException e) {

            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNoInvalid() {
        boolean result = false;
        try {
            result = userRegistration.validateMobileNo("2928824525");
        } catch (UserRegistrationException e) {

            e.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordValid() {
        boolean result = true;
        try {
            result = userRegistration.validatePassword("A1@12g449");
        } catch (UserRegistrationException e) {

            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordFourInvalid() {
        boolean result = false;
        try {
            result = userRegistration.validatePassword("dfffds");
        } catch (UserRegistrationException e) {

            e.printStackTrace();
        }
        Assert.assertFalse(result);
    }
}
