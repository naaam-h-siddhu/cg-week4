package reflection.basic.invokeprivatemethod;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            Method method = calculator.getClass().getDeclaredMethod("multiply",int.class,int.class);
//            method.invoke(calculator,10,10);
            method.setAccessible(true);
            System.out.println(method.invoke(calculator,10,10));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
