package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;

public class PaulStreetBoys {
    public List<String> readIn() throws IOException {
        return Files.readAllLines(Path.of("src/main/java/introexceptioncause/palutcaifiuk.txt"));
    }
    public void writeTheFileToConsole(List<String> names){
        for (String name:names
             ) {
             if (name.equals("Nemecsek Ernő")){
                 System.out.println(name.toLowerCase(Locale.ROOT));
             } else System.out.println(name);
        }
    }

    public static void main(String[] args) {
        try {
            PaulStreetBoys boys = new PaulStreetBoys();
            boys.writeTheFileToConsole(boys.readIn());
        } catch (IOException e){
            throw new IllegalStateException("Nincs file", e);
        }
    }
}
