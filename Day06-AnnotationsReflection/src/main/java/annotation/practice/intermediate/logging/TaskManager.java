package annotation.practice.intermediate.logging;

public class TaskManager {
    @LogExecutionTime
    public void task1(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @LogExecutionTime
    public void task2(){
        try{
            Thread.sleep(200);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void task3(){
        try{
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
