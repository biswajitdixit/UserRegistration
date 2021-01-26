import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_PATTERN="^[0-9A-Za-z]+([._+-][0-9a-zA-Z]+)*@[0-9a-zA-Z]+.[0-9a-zA-Z]{2,4}([.][a-zA-Z]{2})*$";
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
    public static void main(String[] args) {
        UserRegistration ur =new UserRegistration ();
        Scanner bc=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        System.out.println("1.First Name Validation");
        System.out.println("2.Last Name Validation");
        System.out.println("3.Email Validation");
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
        }
    }
}
