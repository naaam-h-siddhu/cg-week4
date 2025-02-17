package reflection.advance.executiontimer;

public class Calculator {
    public int add(int a, int b){
        return a+b;

    }
    public int multiply(int a, int b ){
        return a*b;
    }
    public void slow(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
