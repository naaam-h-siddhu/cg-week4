package annotation.practice.beginner.importantmethod;

public class TaskManager {
    @ImportantMethod
    public void performCriticalTask(){
        System.out.println("Performing a critical task !");
    }
    @ImportantMethod(level =  "MEDIUM")
    public void performImportantTast(){
        System.out.println("Performing an important task !");
    }
    public void performRegularTask(){
        System.out.println("Performing regular task !");
    }
}
