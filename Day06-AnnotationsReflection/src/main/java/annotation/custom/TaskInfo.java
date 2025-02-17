package annotation.custom;

import reflection.advance.executiontimer.MethodTimer;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
 @interface TaskInfoAnnotation {
    int priority() default 1;

    String assignedTo() default "Unassigned";
}


class TaskManager{
    @TaskInfoAnnotation(priority = 5, assignedTo = "Siddhu")
    public void task1(){
        System.out.println("task 1 called");
    }
    @TaskInfoAnnotation(priority = 3, assignedTo = "nitish ji")
    public void task2(){
        System.out.println("task 2 called");
    }
}
public class TaskInfo {
    public static void main(String[] args) {
        try{
            Class<?> taskManagerClass = TaskManager.class;
            Method[] methods = taskManagerClass.getDeclaredMethods();
            for(Method method : methods){
                TaskInfoAnnotation taskInfoAnnotation =  method.getAnnotation(TaskInfoAnnotation.class);
                System.out.println("method: "+method.getName());
                System.out.println("priority is: "+taskInfoAnnotation.priority());
               System.out.println("assinged to: "+taskInfoAnnotation.assignedTo());
                System.out.println();
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
