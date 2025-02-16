package junit.basics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    void add() {
        assertEquals(10, calculator.add(4,6));
        assertEquals(0, calculator.add(-1,1));
    }

    @Test
    void subtract() {
        assertEquals(10, calculator.subtract(40,30));
        assertEquals(-100, calculator.subtract(100,200));
    }

    @Test
    void multiply() {
        assertEquals(0,calculator.multiply(0,4242));

    }

    @Test
    void divide() {
        assertEquals(10, calculator.divide(100,10));
    }
     @Test
     void checkForException(){
        Exception exception = assertThrows(ArithmeticException.class,() -> calculator.divide(100,0));
        assertEquals("/ by zero",exception.getMessage());
     }
    @AfterEach
    void after(){
        System.out.println("✅ Test Passed !!");
    }
}