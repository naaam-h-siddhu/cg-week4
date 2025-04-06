package regex.extractionproblems;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
    public static ArrayList<String> getEmails(String text){
        String regex = "\\b[a-zA-Z0-9._]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}\\b";

        ArrayList<String> emailList = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            emailList.add(matcher.group());
        }
        return emailList;

    }
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org";
        ArrayList<String > emailList = getEmails(text);

        System.out.println("List of email : "+emailList);
    }
}
