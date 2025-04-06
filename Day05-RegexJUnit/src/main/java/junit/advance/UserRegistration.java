package junit.advance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private  String username;
    private String email;
    private String password;

    public String  registerUser(String username,String email, String password)throws IllegalArgumentException{

        if(username == null || !isValidUsername(username))
            throw  new IllegalArgumentException("Invalid Username !!");
        if(email == null || !isValidEmail(email))
            throw new IllegalArgumentException("Invalid Email Address");
        if(password == null || !isValidPassword(password))
            throw new IllegalArgumentException(password);
        return "USER REGISTERED";
    }
    private boolean isValidUsername(String username){
        String regex = "[a-zA-Z0-9_.]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }
    private boolean isValidEmail(String email){
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();

    }
    private boolean isValidPassword(String password){
        String regex = "^(?=.*[A-Z])(?=.*\\\\d).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }


}
