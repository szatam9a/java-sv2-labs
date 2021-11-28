package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {
    @Test
    void containsLongerWordTest(){
        Word word = new Word();
        List<String> toTest = Arrays.asList("alma","kutya","nap");
        assertTrue(word.containsLongerWord(toTest,"ok"));
        assertFalse(word.containsLongerWord(toTest,"napraforgo"));
    }

}