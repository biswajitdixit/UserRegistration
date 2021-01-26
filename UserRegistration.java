import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_PATTERN="^[0-9A-Za-z]+([._+-][0-9a-zA-Z]+)*@[0-9a-zA-Z]+.[0-9a-zA-Z]{2,4}([.][a-zA-Z]{2})*$";
    private static final String MOBILE_PATTERN="[91]+[\s]+[0-9]{10}";
    private static final String PASSWORD1_PATTERN="[a-z A-Z 0-9]{8,}";
    private static final String PASSWORD2_PATTERN="(?=.*?[A-Z])[a-z A-Z 0-9]{8,}";
   public boolean validateFirstName(String FirstName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        boolean res = pattern.matcher(FirstName).matches();
        return res;

    }
    public boolean validateLastName(String LastName ){
        Pattern pattern=Pattern.compile(NAME_PATTERN);
        boolean res=pattern.matcher(LastName).matches();
        return res;
    }
    public  boolean validateEmail(String Email){
        Pattern pattern=Pattern.compile(EMAIL_PATTERN);
        boolean res=pattern.matcher(Email).matches();
        return res;
    }
    public  boolean validateMobileNo(String MobileNo){
        Pattern pattern=Pattern.compile(MOBILE_PATTERN);
        boolean res=pattern.matcher(MobileNo).matches();
        return res;
    }
    public  boolean validatePassword1(String Password1){
        Pattern pattern=Pattern.compile(PASSWORD1_PATTERN);
        boolean res =pattern.matcher(Password1).matches();
        return res;
    }
    public boolean validatePassword2(String Password2){
        Pattern pattern=Pattern.compile(PASSWORD2_PATTERN);
        boolean res =pattern.matcher(Password2).matches();
        return res;
    }
    public static void main(String[] args) {
        UserRegistration ur =new UserRegistration ();
        Scanner bc=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        System.out.println("1.First Name Validation");
        System.out.println("2.Last Name Validation");
        System.out.println("3.Email Validation");
        System.out.println("4.Mobile No Validation");
        System.out.println("5.Password pattern one validation");
        System.out.println("6.Password pattern two validation");
        System.out.println("Enter choice");

        int choice =bc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter the first name ");
                String FirstName= sc.nextLine();
                if ( ur.validateFirstName(FirstName) ){
                    System.out.println("valid");
                }else {
                    System.out.println("not valid");
                }
                break;
            case 2:
                System.out.println("Enter the last name");
                String LastName=sc.nextLine();
                if (ur.validateLastName(LastName) ){
                    System.out.println("valid");
                }else {
                    System.out.println("not valid");
                }
                break;
            case 3:
                System.out.println("Enter the email");
                String Email= sc.nextLine();
                if (ur.validateEmail(Email)){
                    System.out.println("valid");
                }else {
                    System.out.println("not valid");
                }
                break;
            case 4:
                System.out.println("Enter the mobile no");
                String MobileNo=sc.nextLine();
                if (ur.validateMobileNo(MobileNo)){
                    System.out.println("valid");
                }else {
                    System.out.println("not valid");
                }
                break;
            case 5:
                System.out.println("Enter the password");
                String Password1=sc.nextLine();
                if (ur.validatePassword1(Password1)){
                    System.out.println("valid");
                }else {
                    System.out.println("not valid");
                }
                break;
            case 6:
                System.out.println("Enter the password");
                String Password2=sc.nextLine();
                if (ur.validatePassword2(Password2)){
                    System.out.println("valid");
                }else {
                    System.out.println("not valid");
                }
        }
    }

}
