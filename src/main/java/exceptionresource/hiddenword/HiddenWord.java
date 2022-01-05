package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class HiddenWord {
    public String checkTheLine(String line) {

        for (char c : line.toCharArray()) {
            if (Character.isAlphabetic(c))
                return ""+c;
        }
        return " ";
    }

    public String getHiddenWord(Path path) {
        String result = "";
        try (Scanner sc = new Scanner(path)) {
            while (sc.hasNext()) {
                result= result.concat(checkTheLine(sc.nextLine()));
            }

        } catch (IOException ioe) {
            throw new IllegalArgumentException("no file");
        }
    return result;}
}
