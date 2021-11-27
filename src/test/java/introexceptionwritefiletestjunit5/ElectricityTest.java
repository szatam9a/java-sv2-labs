package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ElectricityTest {

    @TempDir
    File temporaryFolder;

    Electricity electricity;

    @Test
    void writeStreets() throws IOException {
        electricity = new Electricity();
        Path path = temporaryFolder.toPath().resolve("street.txt");
        electricity.makeTheListOfTheStreets();
        electricity.writeStreets(path);

        assertEquals(electricity.getStreets(), Files.readAllLines(path));
    }

    @Test
    void makeTheListOfTheStreets() {
        electricity = new Electricity();
        electricity.makeTheListOfTheStreets();
        assertEquals(Arrays.asList(LocalDate.now().toString(), "Jókai utca", "Jó utca", "Jógi utca", "Naspotály utca"), electricity.getStreets());
    }
}