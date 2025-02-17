package reflection.basic.accessprivatefield;

import java.awt.event.FocusEvent;
import java.lang.reflect.Field;

public class Main{
    public static void main(String[] args) {

        Person siddhu = new Person(22);
        try{
           Field field = siddhu.getClass().getDeclaredField("age");
            field.setAccessible(true);
            System.out.println("Old Value: "+field.get(siddhu));
            field.set(siddhu,21);
            System.out.println("New Value: "+field.get(siddhu));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
