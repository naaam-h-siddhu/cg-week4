package regex.basicregex;

import java.util.Scanner;
import java.util.regex.*;

public class ValidateUsername {


    public static boolean checkUsername(String username){
        String regex = "[a-zA-Z][\\w_]{4,14}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }
    public static void main(String[] args) {

        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Username: ");
        String username = sc.nextLine().trim();
        if(checkUsername(username)){
            System.out.println("✅Valid username");
        }
        else System.out.println("❌ Invalid username");

    }



}
