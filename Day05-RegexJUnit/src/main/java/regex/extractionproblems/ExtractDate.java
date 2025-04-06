package regex.extractionproblems;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDate {
    public static ArrayList<String > getDate(String text){
        ArrayList<String> dates = new ArrayList<>();
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            dates.add(matcher.group());

        }
        return dates;


    }
    public static void main(String[] args) {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        ArrayList<String> dates = getDate(text);
        System.out.println("Dates are: "+dates);
    }
}
