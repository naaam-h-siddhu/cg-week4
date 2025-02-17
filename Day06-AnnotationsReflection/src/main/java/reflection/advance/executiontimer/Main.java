package reflection.advance.executiontimer;

import reflection.basic.invokeprivatemethod.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try{
            long addTime = MethodTimer.measureExecutionTime(calculator, "add", 5,10);
            System.out.println("Execution time of add method : "+addTime+" ms");
            long multiplyTime = MethodTimer.measureExecutionTime(calculator,"multiply",5,10);
            System.out.println("Execution time of multiply method : "+multiplyTime+" ms");

            long slowTime = MethodTimer.measureExecutionTime(calculator,"slow");
            System.out.println("Execution time of slow method : "+slowTime+" ms");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
