package junit.basics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class LongTaskTest {

    LongTask longTask = new LongTask();
    @Test
    @Timeout(2)
    void longRunningTask() throws InterruptedException {
        assertEquals("Slept",longTask.longRunningTask(),"Methods taking longer time that expected");
    }
}