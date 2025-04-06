package junit.advance;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    PasswordValidator passwordValidator = new PasswordValidator();
    @Test
    void isStrong() {
        String password = "Pass#@11";
        assertTrue(passwordValidator.isStrong(password));
    }
    @Test
    void isWeak(){
        String password = "gds";
        assertFalse(passwordValidator.isStrong(password));
    }
     @AfterEach
    void turnDown(){
         System.out.println("✅ Test Passed !!");
     }
}