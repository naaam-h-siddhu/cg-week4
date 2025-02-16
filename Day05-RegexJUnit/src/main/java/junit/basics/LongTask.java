package junit.basics;

public class LongTask {
    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
        return "Slept";
    }

}
