package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<String> books = new ArrayList<>();


    public void readIn(Path path) {
        List<String> thefile;
        try {
            thefile= Files.readAllLines(path);
        } catch (IOException e) {
            throw new IllegalArgumentException("No File Read", e);
        }

        String[] tempBook;
        for (String book : thefile
        ) {
            tempBook = book.split(";");
            books.add(tempBook[2].concat(": " + tempBook[1]));
        }
    }

    public List<String> getBooks() {
        return books;
    }

    public void writeIntoFile(Path path){
        try {
            Files.write(path,books);
        } catch (IOException e) {
            throw new IllegalStateException("Cant write the file",e);
        }
    }
}
