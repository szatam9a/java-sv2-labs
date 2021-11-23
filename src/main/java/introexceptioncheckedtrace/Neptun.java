package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Neptun {
    private List<String> neptunID = new ArrayList<>();
    private List<String> namesAndNeptunID;

    public void readIn(Path path) throws IOException{

            namesAndNeptunID = Files.readAllLines(path);
        for (String lines:namesAndNeptunID
             ) {
                String[] temp = lines.split(",");
                neptunID.add(temp[1]);
        }

    }

    public static void main(String[] args) {
      Neptun neptun = new Neptun();
        try {
            neptun.readIn(Path.of("src/main/java/introexceptioncheckedtrace/neptun.csv"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(neptun.neptunID);
    }
}
