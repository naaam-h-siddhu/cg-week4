package regex.extractionproblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ExtractEmailTest {

    ArrayList<String> emails;
    @BeforeEach
    void setEmails(){
        String text = "Contact us at support@example.com and info@company.org";

        emails = ExtractEmail.getEmails(text);
    }
    @Test
    void getEmails() {
        assertEquals(2,emails.size());
        System.out.println("✅ Test Passed !!");
    }
}