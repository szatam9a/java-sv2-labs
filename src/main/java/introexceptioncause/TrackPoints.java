package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {
    public List<Integer> heights = new ArrayList<>();

    public void dataFiller() {
        splitDataAndFillInToHeights(readIn(Path.of("src/main/resources/introexceptioncause/tracking.csv")));
    }

    public List<String> readIn(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void splitDataAndFillInToHeights(List<String> list) {
        for (String actual : list
        ) {
            String[] tmp = actual.split(";");
            heights.add(Integer.parseInt(tmp[2]));
        }
    }

    public void calculateAndWriteOutTheWalkAltitude() {
        for (int i = 1; i < heights.size(); i++) {
            System.out.println(heights.get(i) - heights.get(i - 1));
        }
    }
}
