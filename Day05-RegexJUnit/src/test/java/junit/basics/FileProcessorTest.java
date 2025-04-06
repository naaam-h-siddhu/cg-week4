package junit.basics;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {
    private final String path ="/Users/siddhu/Desktop/cg-tut/Week4/Day05-RegexJUnit/src/main/resources/sample.txt";

    FileProcessor fileProcessor = new FileProcessor();
    @Test
    void fileProcessorTest() {
        String content = "Hi ! welcome to my repo";
        fileProcessor.writeToFile(path,content);
        String readContent = fileProcessor.readFromFile(path);
        assertEquals(content,readContent);

    }

    @Test
    void testException(){
        assertThrows(IOException.class,()->{
            fileProcessor.readFromFile("ghehe");
        });
    }

}