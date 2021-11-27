package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BooksTest {

    Books books;

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();
    @Test
    public void readIn() {
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
    public void writeIntoFile()throws IOException{
        books = new Books();
        books.readIn(Path.of("src/test/resources/introexceptionwritefiletestjunit4/books.txt"));
        Path path = temporaryFolder.newFile("filename.txt").toPath();
        books.writeIntoFile(path);
        assertEquals(books.getBooks(),Files.readAllLines(path));
    }
}