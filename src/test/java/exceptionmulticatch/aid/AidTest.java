package exceptionmulticatch.aid;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AidTest {
    Aid aid;


    @Test
    void dataProcessTest() throws IOException {
        aid = new Aid(1489600);
        List<String> controlPopulation = Files.readAllLines(Path.of("src/test/resources/controlpupulation.txt"));
        assertEquals(controlPopulation, aid.countAmountOfAid(Path.of("src/test/resources/population1.txt")));


    }

    @Test
    void cantProcessTest() {
        aid = new Aid(1489600);
        assertThrows(IllegalArgumentException.class, () -> aid.countAmountOfAid(Path.of("src/test/resources/population2.txt")));
        assertThrows(IllegalArgumentException.class, () -> aid.countAmountOfAid(Path.of("src/test/resources/population3.txt")));
    }
}