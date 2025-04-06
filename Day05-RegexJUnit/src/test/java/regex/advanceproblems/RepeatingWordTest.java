package regex.advanceproblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepeatingWordTest {

    List<String> repeatedWords;
    @BeforeEach
    void setRepeatedWords(){
        String text = "This is is a repeated repeated word test.";
        repeatedWords = RepeatingWord.getWords(text);
    }
    @Test
    void getWords() {
        assertTrue(repeatedWords.contains("is"));
        System.out.println("✅ Test Passed !!");
    }
    @Test
    void getWordsTest2(){
        assertTrue(repeatedWords.contains("repeated"));
        System.out.println("✅ Test Passed !!");
    }
}