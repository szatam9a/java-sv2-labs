package introexceptionreadfiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Words {

    public String getFirstWordWithA(Path path){
        List<String> file = new ArrayList<>();

        try {
            file = Files.readAllLines(path);
        } catch (IOException e) {
            throw new IllegalStateException("No file", e);
        }
        for (String line:file
             ) {
             if (line.charAt(0)=='A'){
                 return line;
             }
        }
        return "A";
    }

}
