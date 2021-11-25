package introexceptionreadfiletestjunit5;

import introexceptionreadfiletestjunit4.Words;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    @Test
    void getFirstWordWithA() {
        introexceptionreadfiletestjunit4.Words words = new Words();
        words.getFirstWordWithA(Path.of("src/test/resources/words.txt"));
        assertEquals("Anna",  words.getFirstWordWithA(Path.of("src/test/resources/words.txt")));

    }
}