package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {

    @Test
    void getWordsStartWithTest() {
        Prefix prefix = new Prefix();
        List<String> toTest = Arrays.asList("Dr. nokedli", "Mr. apuka","Ms. Tarhonya", "Jr. John Dee");

        prefix.getWordsStartWith(toTest,"");
        assertEquals(1,prefix.getWordsStartWith(toTest,"Jr.").size());

        List<String> expected = Arrays.asList("Mr. apuka");
        assertEquals(expected,  prefix.getWordsStartWith(toTest,"Mr."));

        List<String> expectedToNotContain = Arrays.asList("Mr. apuka");
        assertNotEquals(expectedToNotContain, prefix.getWordsStartWith(toTest,"Jr."));
    }
}