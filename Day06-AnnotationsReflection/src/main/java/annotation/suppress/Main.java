package annotation.suppress;

import java.util.ArrayList;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList list = new ArrayList<>();
        list.add(12);
        list.add(14);
        for(Object num: list){
            System.out.println(num);
        }

    }
}
