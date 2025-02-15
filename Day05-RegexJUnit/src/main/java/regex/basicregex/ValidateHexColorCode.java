package regex.basicregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexColorCode {
    public static boolean validateHex(String colorCode){
        String regex = "#[a-fA-F0-9]{6}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(colorCode);
        return matcher.matches();
    }

    public static void main(String[] args) {
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hex Color Code: ");
        String code = sc.nextLine().trim();
        if(validateHex(code))
            System.out.println("✅ Valid");
        else System.out.println("❌ Invalid");
    }
}
