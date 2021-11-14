package controlselection.controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToConsonantTest {
    @Test
    void testVowel() {
        assertEquals('b', new ToConsonant().charConverter('a'));
        assertEquals('f', new ToConsonant().charConverter('e'));
        assertEquals('j', new ToConsonant().charConverter('i'));
    }

    @Test
    void testConsonant() {
        assertEquals('b', new ToConsonant().charConverter('b'));
        assertEquals('g', new ToConsonant().charConverter('g'));
        assertEquals('z', new ToConsonant().charConverter('z'));
    }

}