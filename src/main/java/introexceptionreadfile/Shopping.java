package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.PrimitiveIterator;

public class Shopping {
    private List<String>  items ;

    public Shopping() {
        try {
            items = Files.readAllLines(Path.of("src/main/java/introexceptionreadfile/shoppinglist.txt"));
        } catch (IOException ioe){
            throw new IllegalStateException("nincs file");
        }
    }

    public static void main(String[] args) {
        Shopping shopping = new Shopping();
        System.out.println(shopping);
    }

    @Override
    public String toString() {
        return "Shopping{"+
                "items=" + items +
                '}';
    }
}
