package junit.advance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    private final String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[a-z])(?=.*[@#$%*&])[A-Za-z0-9@#$%&*]{8,}$";

    public boolean isStrong(String password){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
