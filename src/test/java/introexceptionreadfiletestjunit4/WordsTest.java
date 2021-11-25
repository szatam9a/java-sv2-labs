package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.Assert.*;

public class WordsTest {

    @Test
    public void getFirstWordWithA() {
        Words words = new Words();
        words.getFirstWordWithA(Path.of("src/test/resources/words.txt"));
        assertEquals("Anna",  words.getFirstWordWithA(Path.of("src/test/resources/words.txt")));

    }

}