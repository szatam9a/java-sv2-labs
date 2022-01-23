package lambdaintermediate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongWordsTest {
    LongWords longWords;

    @BeforeEach
    void init() {
        longWords = new LongWords();
        longWords.getWords().add("Something");
        longWords.getWords().add("Anything");
        longWords.getWords().add("Some");
    }

    @Test
    void getNumberOfWordsStartWithTest() {
        assertEquals(2, longWords.getNumberOfWordsStartWith("Some"));
        assertEquals(1, longWords.getNumberOfWordsStartWith("Any"));
    }


    @Test
    void getLongerWordsTest() {
        assertEquals(3, longWords.getLongerWords(3).size());
    }

    @Test
    void getShortestWordContainingGivenCharacterTest() {
        assertEquals("Some", longWords.getShortestWordContainingGivenCharacter('S').get());
    }
}