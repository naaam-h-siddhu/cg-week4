package reflection.advance.executiontimer;

import java.lang.reflect.Method;

public class MethodTimer {
    public static long measureExecutionTime(Object obj, String methodName, Object... args) throws Exception {
        // Handle methods with no arguments
        Class<?>[] parameterTypes = new Class<?>[args.length];
        for (int i = 0; i < args.length; i++) {
            if (args[i] instanceof Integer) {
                parameterTypes[i] = int.class; // Handle int primitive
            } else {
                parameterTypes[i] = args[i].getClass(); // Handle other types
            }
        }

        // Get the method by name and parameter types
        Method method = obj.getClass().getMethod(methodName, parameterTypes);

        // Measure execution time
        long startTime = System.nanoTime();
        method.invoke(obj, args); // Invoke the method
        long endTime = System.nanoTime();

        // Return the duration in milliseconds
        return (endTime - startTime) / 1_000_000;
    }
}