package exceptionresource.hiddenword;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class HiddenWordTest {

    @Test
    void getHiddenWordTest() {
        HiddenWord hiddenWord = new HiddenWord();
        assertEquals("ALMA KÖRTE",hiddenWord.getHiddenWord(Path.of("src/main/resources/hiddenword/hiddenword.txt")));
    }
}