package regex.extractionproblems;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalizedWords {
    public static ArrayList<String> getWords(String text){
        String regex = "\\b[A-Z]\\w+\\b";
        Pattern pattern = Pattern.compile(regex);
        ArrayList<String> words = new ArrayList<>();
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){

            words.add(matcher.group());
        }
        return words;
    }
    public static void main(String[] args) {
       String text =  "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
       ArrayList<String> words = getWords(text);
        System.out.println("List of capital words : "+words);

    }
}
