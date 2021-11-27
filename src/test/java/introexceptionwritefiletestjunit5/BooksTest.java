package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    Books books;
    @TempDir
    File tempFold;

    @Test
    void readIn() {
        books = new Books();
        books.readIn(Path.of("src/test/resources/introexceptionwritefiletestjunit4/books.txt"));

        assertEquals(Arrays.asList(
                        "Gárdonyi Géza: Egri csillagok",
                        "Molnár Ferenc: Pál utcai fiúk",
                        "Fekete István: Tüskevár",
                        "Jókai Mór: Kőszívű ember fiai"),
                books.getBooks());
    }


    @Test
    void writeIntoFile()throws IOException {
        Path path = tempFold.toPath().resolve("filename.txt");
        books = new Books();
        books.readIn(Path.of("src/test/resources/introexceptionwritefiletestjunit5/books.txt"));
        books.writeIntoFile(path);
        assertEquals(books.getBooks(), Files.readAllLines(path));
    }
}