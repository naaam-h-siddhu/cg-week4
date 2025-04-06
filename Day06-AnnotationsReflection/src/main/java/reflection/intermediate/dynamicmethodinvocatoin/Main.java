package reflection.intermediate.dynamicmethodinvocatoin;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the method you want to call");
        String methodName = sc.nextLine();
//        sc.next();
        try{
            MathOperations mathOperations = new MathOperations();

            Method[] methods = mathOperations.getClass().getDeclaredMethods();
            for(Method method : methods){
                if(method.getName().equals(methodName)){
                    System.out.println("enter two number to "+methodName);
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    Object result = method.invoke(mathOperations,a,b);
                    System.out.println("Result : "+result);
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
