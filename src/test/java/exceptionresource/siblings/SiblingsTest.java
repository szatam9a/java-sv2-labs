package exceptionresource.siblings;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class SiblingsTest {

    @Test
    void getFullNamesTest() {
        Siblings siblings = new Siblings();
        assertEquals("Szabó Emese",siblings.getFullNames("Szabó",Path.of("src/main/resources/siblings/names.txt")).get(0));
    }
}