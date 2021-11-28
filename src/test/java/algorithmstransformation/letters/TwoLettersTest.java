package algorithmstransformation.letters;

import chars.LettersAndDigits;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {

    @Test
    void getFirstTwoLettersTest() {
        TwoLetters twoLetters = new TwoLetters();
        List<String> toTest = Arrays.asList("alma","béka","répa");
        List<String> expected = Arrays.asList("al","bé","ré");
        assertEquals(expected,  twoLetters.getFirstTwoLetters(toTest));
        assertEquals(expected.size(),twoLetters.getFirstTwoLetters(toTest).size());

    }
}