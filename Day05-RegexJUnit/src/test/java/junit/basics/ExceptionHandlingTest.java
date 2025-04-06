package junit.basics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionHandlingTest {

    ExceptionHandling exceptionHandling = new ExceptionHandling();
    @Test
    void divide() {
        Exception exception = assertThrows(ArithmeticException.class,() ->  exceptionHandling.divide(10,0));
        assertEquals("Divisor is zero", exception.getMessage());

    }
    @Test
    void divide2(){
        assertEquals(10, exceptionHandling.divide(100,10));
    }
    @AfterEach
    void afterTest(){
        System.out.println("✅ Test Passed !!");
    }
}