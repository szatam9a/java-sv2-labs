package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutAccentsTest {
    @Test
    void testWith() {
        assertEquals('a', new WithoutAccents().removeAccent('á'));
        assertEquals('e', new WithoutAccents().removeAccent('é'));
    }

    @Test
    void testWithout() {
        assertEquals('f', new WithoutAccents().removeAccent('f'));
        assertEquals('u', new WithoutAccents().removeAccent('u'));
        assertEquals('c', new WithoutAccents().removeAccent('c'));
        assertEquals('k', new WithoutAccents().removeAccent('k'));
    }

}