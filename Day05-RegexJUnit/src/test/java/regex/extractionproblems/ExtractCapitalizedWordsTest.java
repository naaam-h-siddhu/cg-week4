package regex.extractionproblems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ExtractCapitalizedWordsTest {

    ArrayList<String> words;
    @BeforeEach
    void setWords(){
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        words = ExtractCapitalizedWords.getWords(text);
    }
    @Test
    void getWords() {
        assertTrue(words.contains("Liberty"));
    }
}