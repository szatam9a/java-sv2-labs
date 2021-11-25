package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class RoadMap {
    private List<String> cityNamesInMyWay = Arrays.asList("MOnor","Cegléd0","Kecskemét","Kecske");

    public void writeIntAFile(Path path){
         try {
             Files.write(Path.of("roadmap.txt"), cityNamesInMyWay);
         } catch (IOException e ){
             throw new IllegalStateException("Cant Write The file", e);
         }
    }
}
