package introexceptioncause;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Poem {
    public List<String> readIn(){
        try {
            return Files.readAllLines(Path.of("src/main/java/introexceptioncause/poem.txt"));
        } catch (IOException e) {
            throw new IllegalStateException("Nincs file", e);
        }
    }

    public void theFirstLetters(List<String> list) {
        for (String lines : list
        ) {
            System.out.print(lines.charAt(0));
        }
    }

    public static void main(String[] args) {
        try {
            Poem poem = new Poem();
            poem.theFirstLetters(poem.readIn());
        } catch (IllegalStateException ise) {
            System.out.println(ise.getCause());
        }


    }
}
