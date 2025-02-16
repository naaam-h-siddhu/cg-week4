package junit.basics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumberTest {
    EvenNumber evenNumber = new EvenNumber();
    @ParameterizedTest
    @ValueSource(ints = {2,6,18,20})
    void testIsEven(int number){
        assertTrue(evenNumber.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1,3,5,7})
    void testIsOdd(int number){
        assertFalse(evenNumber.isEven(number));
    }
    @AfterEach
    void tearDown(){
        System.out.println("✅ Test Passed !!");
    }

}