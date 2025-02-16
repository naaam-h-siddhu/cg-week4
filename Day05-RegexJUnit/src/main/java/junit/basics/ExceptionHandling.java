package junit.basics;

public class ExceptionHandling {
    public int divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Divisor is zero");
        }
        return a/b;
    }
}
