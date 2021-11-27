package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ElectricityTest {

    Electricity electricity;
    @Rule
    public TemporaryFolder temporalyFolder = new TemporaryFolder();

    @Test
    public void writeStreets() throws IOException {
        Path path = temporalyFolder.newFile( "streets.txt").toPath();
        electricity = new Electricity();
        electricity.makeTheListOfTheStreets();
        electricity.writeStreets(path);
        List<String> lines = Files.readAllLines(path);
        assertEquals(electricity.getStreets(),lines);
    }

    @Test
    public void makeTheListOfTheStreets() {
        electricity = new Electricity();
        electricity.makeTheListOfTheStreets();
        assertEquals(Arrays.asList(LocalDate.now().toString(),"Jókai utca","Jó utca","Jógi utca","Naspotály utca"),electricity.getStreets());
    }
}