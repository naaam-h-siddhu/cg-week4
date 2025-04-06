package junit.advance;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    private DateFormatter dateFormatter = new DateFormatter();
    @Test
    void formatDate() {
        String input = "2025-02-16";
        String expected = "16-02-2025";
        assertEquals(expected,dateFormatter.formatDate(input));
    }
    @Test
    void testInvalidFormat() {
        String input = "05-10-2023";
        assertThrows(IllegalArgumentException.class, () -> {
            dateFormatter.formatDate(input);
        });
    }
    @Test
    void testInvalidDate(){
        String input = "2020-02-30";
        assertThrows(IllegalArgumentException.class, ()-> {
            dateFormatter.formatDate(input);
        });

    }
     @AfterEach
    void turnDown(){
         System.out.println("✅ Test Passed !!");
     }
}