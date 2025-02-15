package regex.basicregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicensePlate {
    public static boolean validateNumberPlate(String number){
        String regex = "[A-Z]{2}[0-9]{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();

    }

    public static void main(String[] args) {
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Licence place number: ");
        String number = sc.nextLine().trim();
        if(validateNumberPlate(number))
            System.out.println("✅ Valid number plate");
        else System.out.println("❌ Invalid");
    }
}
