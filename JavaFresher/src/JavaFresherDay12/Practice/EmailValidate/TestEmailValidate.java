package JavaFresherDay12.Practice.EmailValidate;

public class TestEmailValidate {
    private static EmailValidate emailExample;
    public static final String[] validEmail = new String[] { "a@gmail.com.vn", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String args[]) {
        emailExample = new EmailValidate();
        for (String email : validEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }

}
