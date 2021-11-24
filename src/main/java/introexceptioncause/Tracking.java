package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Tracking {
    public List<Integer> heights = new ArrayList<>();

    public Tracking() {
        dataFiller();

    }

    public void dataFiller() {
        splitData(readIn(Path.of("src/main/resources/tracking.csv")));
    }

    public List<String> readIn(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void splitData(List<String> list) {
        String[] tmp;
        for (String actual : list
        ) {
            tmp = actual.split(";");
            heights.add(Integer.parseInt(tmp[2]));
        }
    }

    public void calculateAndWriteOutTheWalkAltitude() {
        for (int i = 1; i < heights.size(); i++) {
            System.out.println(heights.get(i) - heights.get(i - 1));
        }
    }

    public static void main(String[] args) {
        Tracking tracking = new Tracking();
        tracking.calculateAndWriteOutTheWalkAltitude();
    }
}
