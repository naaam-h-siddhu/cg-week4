package regex.extractionproblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ExtractDateTest {
    ArrayList<String> dates;
    @BeforeEach
    void setDates(){
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        dates = ExtractDate.getDate(text);

    }
    @Test
    void getDate() {
        assertEquals(3,dates.size());
        System.out.println("✅ Test Passed " +
                "");
    }
}