package regex.basicregex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ValidateHexColorCodeTest {

    String[] colors;
    @BeforeEach
    void setColors(){
        colors = new String[]{"#FFA500","ff4500","#123"};
    }
    @Test
    void validateHex() {
        assertTrue(ValidateHexColorCode.validateHex(colors[0]));
        System.out.println("test Passed !!");
    }
     @Test
    void validateHex2(){
        assertFalse(ValidateHexColorCode.validateHex(colors[2]));
         System.out.println("test Passed !!");
     }
}