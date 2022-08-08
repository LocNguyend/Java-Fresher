package JavaFresherDay12.Exercise.ClassValidate;


public class TestClassValidate {

    private static ClassValidate classValidateExample;
    public static final String[] validEmail = new String[] { "C0318G", "A1323K"};
    public static final String[] invalidEmail = new String[] { "B3132G", "A@323G", "A@212K" };

    public static void main(String args[]) {
        classValidateExample = new ClassValidate();
        for (String email : validEmail) {
            boolean isvalid = classValidateExample.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = classValidateExample.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }

}

