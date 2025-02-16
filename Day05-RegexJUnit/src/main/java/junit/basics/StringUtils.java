package junit.basics;

public class StringUtils {
    public String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i++) != s.charAt(j--))
                return false;


        }
        return true;
    }
    public String toUpperCase(String s){
        return s.toUpperCase();
    }
}

