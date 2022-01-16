package searching;

import java.util.Collections;
import java.util.List;

public class BookSearch {
    List<Book> books;

    public BookSearch(List<Book> books) {
        this.books = books;
    }

    public Book findBookByAuthorTitle(String author, String title) {
        if (author.isBlank() || title.isBlank() || title == null || author == null)
            throw new IllegalArgumentException("null string");
        int i = Collections.binarySearch(books, new Book(title, author));
        if (i < 0) throw new IllegalArgumentException("no book by " + author + "-" + title);
        return books.get(i);
    }
}
