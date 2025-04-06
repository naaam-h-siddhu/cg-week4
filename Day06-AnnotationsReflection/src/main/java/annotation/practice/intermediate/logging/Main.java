package annotation.practice.intermediate.logging;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {


        try {
            TaskManager taskManager = new TaskManager();
            Class<?> taskManagerClass = taskManager.getClass();
            for (Method method : taskManagerClass.getDeclaredMethods()) {
                if (method.isAnnotationPresent(LogExecutionTime.class)) {
                    LogExecutionTime logExecutionTime = method.getAnnotation(LogExecutionTime.class);
                    long startTime = System.nanoTime();
                    method.invoke(taskManager);
                    long endTime = System.nanoTime();
                    System.out.println("Method " + method.getName());
                    System.out.println("Time: " + (endTime - startTime));
                    System.out.println();
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
