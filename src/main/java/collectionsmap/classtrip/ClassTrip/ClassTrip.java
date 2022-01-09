package collectionsmap.classtrip.ClassTrip;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassTrip {
    private Map<String, Integer> inPayments = new HashMap<>();

    public void loadInPayments(Path path) {
        String [] temp;
        for (String s : readFile(path)) {
            temp= s.split(":");
            inPayments.put(temp[0].trim(),Integer.parseInt(temp[1].trim()));
        }
    }

    private List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException io) {
            throw new IllegalArgumentException("NO file");
        }
    }

    public Map<String, Integer> getInPayments() {
        return inPayments;
    }

    public void setInPayments(Map<String, Integer> inPayments) {
        this.inPayments = inPayments;
    }
}
