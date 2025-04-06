package regex.extractionproblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ExtractLinksTest {

    ArrayList<String> urls;
    @BeforeEach
    void setUrls(){
        String text = "Visit https://www.google.com and http://example.org for more info.";
        urls = ExtractLinks.getUrl(text);
;
    }
    @Test
    void getUrl() {
        assertEquals(2,urls.size());
        System.out.println("✅ Test Passed ");
    }
}