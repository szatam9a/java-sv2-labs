package introexceptionfinally;

import com.sun.source.tree.IfTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Names {
    public void readInFile(Path path){
        List<String> result = new ArrayList<>();
        try {
            result= Files.readAllLines(path);
            findTheDoctor(result);
        } catch (IOException e) {
            throw  new IllegalStateException("No file", e);
        }
        finally {

            System.out.println("End of reading");
        }
    }
    public void findTheDoctor(List<String> list){
        boolean isThere = false;
        for (String name: list
             ) {
            if (name.startsWith("dr")) {
                System.out.println(name);
                isThere= true;
            }
        }
        if (!isThere){
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Names names = new Names();
        names.readInFile(Path.of("src/main/resources/introexceptionfinally/names.txt"));
        names.readInFile(Path.of("src/main/resources/introexceptionfinally/names2.txt"));
    }
}
