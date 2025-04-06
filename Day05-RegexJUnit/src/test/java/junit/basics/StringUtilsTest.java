package junit.basics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    StringUtils stringUtils = new StringUtils();
    @Test
    void reverse() {
        assertEquals("uhddis", stringUtils.reverse("siddhu"));
    }

    @Test
    void isPalindrome() {
        assertTrue(stringUtils.isPalindrome("aabbaa"));
        assertFalse(stringUtils.isPalindrome("avb"));
    }

    @Test
    void toUpperCase() {
        assertEquals("SIDDHU", stringUtils.toUpperCase("siddhu"));
        assertEquals("SIDDHU", stringUtils.toUpperCase("SiddHU"));
    }
    @AfterEach
    void afterTest(){
        System.out.println("✅ Test Passed !!");
    }
}