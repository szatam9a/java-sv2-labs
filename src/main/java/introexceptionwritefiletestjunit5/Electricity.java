package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {
    private List<String> streets = new ArrayList<>();
    public void writeStreets(Path path ){
        try {
            Files.write(path,streets);
        } catch (IOException e){
            throw new IllegalStateException("No write", e);
        }
    }

    public void makeTheListOfTheStreets(){
        streets.add(LocalDate.now().toString());
        streets.add("Jókai utca");
        streets.add("Jó utca");
        streets.add("Jógi utca");
        streets.add("Naspotály utca");
     }

    public List<String> getStreets() {
        return streets;
    }
}
