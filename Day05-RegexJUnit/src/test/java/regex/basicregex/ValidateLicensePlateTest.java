package regex.basicregex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateLicensePlateTest {

    String[] s;
    @BeforeEach
    void setS(){
        s = new String[]{"AB1234", "131AB2"};
    }
    @Test
    void validateNumberPlate() {
        assertTrue(ValidateLicensePlate.validateNumberPlate(s[0]));
        System.out.println("Test 1 Passed !!");
    }
    @Test
    void validateNumberPlate2(){
        assertFalse(ValidateLicensePlate.validateNumberPlate(s[1]));
        System.out.println("Test 2 Passed !!");
    }
}