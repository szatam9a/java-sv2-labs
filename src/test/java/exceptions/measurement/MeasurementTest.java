package exceptions.measurement;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MeasurementTest {
    Measurement measurement;

    @Test
    void readFromFileTest() {
        measurement = new Measurement();
        measurement.readFromFile(Path.of("src/test/resources/exceptions/measurementdata.csv"));

        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> measurement.readFromFile(Path.of("src/test/resources/exceptions/measurementdat.csv")));
        assertEquals("No file", ise.getMessage());
    }

    @Test
    void validateTest() {
        measurement = new Measurement();
        List<String> toTest = measurement.validate(measurement.readFromFile(Path.of("src/test/resources/exceptions/measurementdata.csv")));
        List<String> controlFile = measurement.readFromFile(Path.of("src/test/resources/exceptions/invalidlines.csv"));
        assertEquals(controlFile, toTest);
    }

    @Test
    void invalidDataTest() {
        measurement = new Measurement();
        List<String> toTest = Arrays.asList("",
                "7");
        assertEquals(2,measurement.validate(toTest).size());
    }
}