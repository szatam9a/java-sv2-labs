package methodparam.sums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SeparatedSum {
    public Sumed sum(String floatingNumbers) {

        Sumed sumed = new Sumed();
        String numbers[] = replaceAndSplitToWorkWith(floatingNumbers).split(";");

        for (String i : numbers
        ) {
            sumed.addANumber(Double.parseDouble(i));
        }
        return sumed;

    }

    public Sumed sum() {
        Sumed sumed = new Sumed();
        String firstLine;
        try {
            firstLine = Files.readAllLines(Path.of("src/main/resources/methodsparam.sums/floatingnumbers.txt")).get(0);
        } catch (IOException zoe) {
            throw new IllegalStateException("No file read");
        }

        String numbers[] = replaceAndSplitToWorkWith(firstLine).split(";");

        for (String i : numbers
        ) {
            sumed.addANumber(Double.parseDouble(i));
        }
        return sumed;
    }


    private String replaceAndSplitToWorkWith(String data) {
        return data.replaceAll(",", ".");
    }
}
