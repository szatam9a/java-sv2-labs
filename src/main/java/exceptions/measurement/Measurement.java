package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {

    public List<String> readFromFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException io) {
            throw new IllegalStateException("No file");
        }
    }

    public List<String> validate(List<String> allLines) {
        List<String> invalidDataLines = new ArrayList<>();
        for (String line : allLines) {
            if (isItInvalidLine(line)) {
                invalidDataLines.add(line);
            }
        }
        return invalidDataLines;
    }

    private boolean isItInvalidLine(String line) {
        String[] data = line.split(",");

        if (isDataInvalid(data)) return true;
        if (isNameInvalid(data)) return true;
        return false;
    }

    private boolean isDataInvalid(String[] data) {
        try {
            Integer.parseInt(data[0]);
            Double.parseDouble(data[1]);
        } catch (Exception somethingIsWrong) {
            return true;
        }
        return false;
    }

    private boolean isNameInvalid(String[] data) {
        try {
            if (data[2].split(" ").length < 2 || data.length > 3) {
                return true;
            }
        } catch (ArrayIndexOutOfBoundsException aiob) {
            return true;
        }
        return false;
    }
}
