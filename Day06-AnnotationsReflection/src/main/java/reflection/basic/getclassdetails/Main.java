package reflection.basic.getclassdetails;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Created a scanner for inputs
//        Dog dog = new Dog();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the class name: ");
        String className = sc.nextLine();
        try{
            Class<?> classToPrint = Class.forName("reflection.basic.getclassdetails."+className);
            System.out.println("Class Name: "+classToPrint);

            Method[] methods = classToPrint.getDeclaredMethods();
            System.out.println("List of Methods : ");
            for (Method method: methods){
                System.out.println(method.getName());
            }
            System.out.println();

            System.out.println("List of Fields: ");
            Field[] fields = classToPrint.getDeclaredFields();
            for(Field field : fields){
                System.out.println(field.getName());
            }
            System.out.println();
            System.out.println("List of constructors : ");

            Constructor<?>[] constructors = classToPrint.getDeclaredConstructors();
            for(Constructor<?> constructor : constructors){
                System.out.println(constructor.getName());
            }
        }catch (ClassNotFoundException e){
            System.out.println(e.getException());
        }

    }
}
