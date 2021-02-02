import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class UserRegistrationTest {

    private String emailId;
    private boolean expected;

    public UserRegistrationTest(String emailId, boolean expected) {
        this.emailId = emailId;
        this.expected = expected;
    }
    @Parameterized.Parameters(name= "{index}: isValid({0})={1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                        {"abc@yahoo.com", true},
                        {"abc-100@yahoo.com", true},
                        {"abc.100@yahoo.com", true},
                        {"abc.100@abc.net", true},
                        {"abc@1.com", true},
                        {"abc", false},
                        {"abc@.com.my",false},
                        {"abc123@.com",false }
                }
        );
    }
    @Test
    public void testIsValidEmailId() throws Exception {
        boolean actual= UserRegistration.validateEmail(emailId);
        assertThat(actual, is(equalTo(expected)));
    }
}
