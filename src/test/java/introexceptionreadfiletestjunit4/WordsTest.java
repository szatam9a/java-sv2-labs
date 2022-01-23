package introexceptionreadfiletestjunit4;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsTest {

    @Test
    public void getFirstWordWithA() {
        Words words = new Words();
        words.getFirstWordWithA(Path.of("src/test/resources/words.txt"));
        assertEquals("Anna",  words.getFirstWordWithA(Path.of("src/test/resources/words.txt")));

    }

}