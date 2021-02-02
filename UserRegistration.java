import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
    private static final String MOBILE_PATTERN = "[91]+[\s]+[0-9]{10}";
    private static final String PASSWORD_PATTERN = "(?=.*?[A-Z])(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{8,}$";

    public boolean validateFirstName(String FirstName) throws UserRegistrationException{
        try {
            Pattern pattern = Pattern.compile(NAME_PATTERN);
        boolean res = pattern.matcher(FirstName).matches();
        return res;}
        catch (Exception e){
         throw new UserRegistrationException("invalid entry");
        }

    }

    public boolean validateLastName(String LastName) throws UserRegistrationException{
        try {
            Pattern pattern = Pattern.compile(NAME_PATTERN);
        boolean res = pattern.matcher(LastName).matches();
        return res;}catch (Exception e){
            throw new UserRegistrationException("invalid Entry");
        }
    }

    public static boolean validateEmail(String Email) throws UserRegistrationException{
        try {
            Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        boolean res = pattern.matcher(Email).matches();
        return res;}catch (Exception e){
            throw new UserRegistrationException("invalid Entry");
        }
    }

    public boolean validateMobileNo(String MobileNo) throws UserRegistrationException{
        try {
            Pattern pattern = Pattern.compile(MOBILE_PATTERN);
        boolean res = pattern.matcher(MobileNo).matches();
        return res;}catch (Exception e){
            throw new UserRegistrationException("invalid Entry");
        }
    }



    public boolean validatePassword(String Password) throws UserRegistrationException{
       try {
           Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        boolean res = pattern.matcher(Password).matches();
        return res;}catch (Exception e){
           throw new UserRegistrationException("invalid Entry");
       }
    }
}
