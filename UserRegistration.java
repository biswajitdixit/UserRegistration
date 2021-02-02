import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
    private static final String MOBILE_PATTERN = "[91]+[\s]+[0-9]{10}";
    private static final String PASSWORD_PATTERN = "(?=.*?[A-Z])(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{8,}$";

    UserValidator validateFirstName = (s) -> (Pattern.compile(NAME_PATTERN).matcher(s).matches());
    UserValidator validateLastName = (s) -> (Pattern.compile(NAME_PATTERN).matcher(s).matches());
    UserValidator validateEmail = (s) -> (Pattern.compile(EMAIL_PATTERN).matcher(s).matches());
    UserValidator validateMobile = (s) -> (Pattern.compile(MOBILE_PATTERN).matcher(s).matches());
    UserValidator validatePassword = (s) -> (Pattern.compile(PASSWORD_PATTERN).matcher(s).matches());
}
@FunctionalInterface
interface UserValidator {
    boolean validate(String s);
}
