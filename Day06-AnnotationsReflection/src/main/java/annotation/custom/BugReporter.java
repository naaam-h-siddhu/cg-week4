package annotation.custom;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport{
    String desc();
}



@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports{
    BugReport[] value();
}


class TaskManagers{
    @BugReport(desc = "Bug 1: null pointer exceptions")
    @BugReport(desc = "Bug 2 : Class not found exceptions")
    public void process(){
        System.out.println("Task processed ");
    }
}
public class BugReporter {
    public static void main(String[] args) {


        try {
            Method method = TaskManagers.class.getMethod("process");
            if(method.isAnnotationPresent(BugReports.class)){
                BugReports bugReports = method.getAnnotation(BugReports.class);
                for(BugReport bugReport : bugReports.value()){
                    System.out.println("Bug Report : "+bugReport.desc());
                }
            }

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
