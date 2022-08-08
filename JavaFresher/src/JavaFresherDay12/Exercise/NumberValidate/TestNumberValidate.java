package JavaFresherDay12.Exercise.NumberValidate;

//import JavaFresherDay12.Exercise.ClassValidate.ClassValidate;

public class TestNumberValidate {

    private static NumberValidate numberValidateExample;
    public static final String[] validNumber = new String[] { "(84)-(0978489648)"};
    public static final String[] invalidnumber = new String[] { "(a8)-(22222222)" };

    public static void main(String args[]) {
        numberValidateExample = new NumberValidate();
        for (String number : validNumber) {
            boolean isvalid = numberValidateExample.validate(number);
            System.out.println("Number is " + number +" is valid: "+ isvalid);
        }
        for (String number : invalidnumber) {
            boolean isvalid = numberValidateExample.validate(number);
            System.out.println("Number is " + number +" is valid: "+ isvalid);
        }
    }
}
