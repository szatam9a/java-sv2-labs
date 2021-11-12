package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    Words words;

    @BeforeEach
    void setUp() {
        words = new Words();
        words.addWord("alma");
        words.addWord("almafa");
        words.addWord("répafa");
        words.addWord("kutya");
    }
        @Test
        void testGetWordsStartWith(){
            List<String> expected = Arrays.asList("alma","almafa");
            words.getWordsStartWith("a");
            assertEquals(expected,words.getList());
        }
        @Test
        void testGetWordsWithLength(){
            List<String> expected = Arrays.asList("alma");
            words.getWordsWithLength(4);
            assertEquals(expected, words.getList());
        }
}