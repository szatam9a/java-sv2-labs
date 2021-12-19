package interfacerules.bill;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Bill {
    List<String> readBillItemsFromFile(Path path){
        try {
            return Files.readAllLines(path);
        }catch (IOException io){
            throw new IllegalArgumentException("no file");
        }
    }
}
