package annotation.practice.beginner.importantmethod;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<?> clazz  = TaskManager.class;
        for(Method method: clazz.getDeclaredMethods()){
            if(method.isAnnotationPresent(ImportantMethod.class)){
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method : "+method.getName());
                System.out.println("Importance Level : "+annotation.level());
                System.out.println();
            }
        }
    }
}
