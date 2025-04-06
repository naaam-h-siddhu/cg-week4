package junit.advance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormatter {
    private final String regex = "^(\\d{4})-(\\d{2})-(\\d{2})$";

    public String formatDate(String inputDate) throws IllegalArgumentException{
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputDate);

        //check if input is correct
        if(!matcher.matches())
            throw new IllegalArgumentException("Invalid date format");
        String year = matcher.group(1);
        String month = matcher.group(2);
        String day = matcher.group(3);

        // check if it is valid
        if(!isValidDate(year,month,day))
            throw new IllegalArgumentException(("Invalid date"));
        return day+"-"+ month+"-"+year;
    }
    public boolean isValidDate(String year, String month , String day){
        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);

        if((m == 4 || m == 6 || m == 9 || m ==11) && d > 30)
            return false;
        if (m == 2) {
            if(isLeapYear(y) && d>29) return false;
            if(!isLeapYear(y) && d >28) return false;
        }
        return true;
    }
    private boolean isLeapYear(int y){
        if(y%100 == 0 && y %400 == 0){
            return true;
        }
        else if(y % 100 != 0 && y %4 == 0){
            return true;
        }
        return false;
    }

}
