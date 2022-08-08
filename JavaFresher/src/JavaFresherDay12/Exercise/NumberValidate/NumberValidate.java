package JavaFresherDay12.Exercise.NumberValidate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidate {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String NUMBER_REGEX =   "^[(]{1}[0-9]{2}[)]{1}[-]{1}[(]{1}[0]{1}[0-9]{9}[)]$";

    public NumberValidate() {
        pattern = Pattern.compile(NUMBER_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
