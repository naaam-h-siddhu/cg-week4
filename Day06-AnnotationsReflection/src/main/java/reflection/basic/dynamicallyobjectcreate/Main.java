package reflection.basic.dynamicallyobjectcreate;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        try {
            Class<?> cls = Student.class;


            Constructor<?> constructor = cls.getConstructor(String.class,int.class);
            Student student = (Student) constructor.newInstance("Siddhu",21);
            student.getDetails();
        }catch (Exception e){
            System.out.println("NOt working");
        }
    }
}
