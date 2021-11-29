package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {

    @Test
    void getNumberOfVowelsTest() {
    Vowels vowels = new Vowels();
    assertEquals(3,  vowels.getNumberOfVowels("aaa"));
    assertEquals(1,  vowels.getNumberOfVowels("a"));
    assertEquals(0,  vowels.getNumberOfVowels("b"));
    assertEquals(5,  vowels.getNumberOfVowels("aaaaa"));
    }
}