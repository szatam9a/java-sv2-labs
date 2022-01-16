package genericsusage.withoutgenerics;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List books = new ArrayList<>();

    public Book getFirstBook(List<Book> books) {
        if (books == null) {
            throw new NullPointerException();
        }
        if (books.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return books.get(0);
    }
}
