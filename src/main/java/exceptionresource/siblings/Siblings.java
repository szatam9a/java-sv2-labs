package exceptionresource.siblings;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Siblings {
    public List<String> getFullNames(String lastName, Path path) {
        List<String> result = new ArrayList<>();
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                result.add(lastName.concat(" ").concat(scanner.nextLine()));
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("no file");
        }
        return result;
    }
}


