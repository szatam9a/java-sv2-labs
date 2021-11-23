package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Holiday {
    public static void main(String[] args) throws IOException {


        try {
            List<String> list;
            for (String s : list = Files.readAllLines(Paths.get("src/main/java/introexceptionreadfile/holiday.txt"))) {
                System.out.println(s);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        try {
            List<String> list;
            for (String s : list = Files.readAllLines(Path.of("src/main/java/introexceptionreadfile/holiday.txt"))) {
                System.out.println(s);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
