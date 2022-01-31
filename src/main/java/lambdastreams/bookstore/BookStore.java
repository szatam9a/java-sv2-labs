package lambdastreams.bookstore;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class BookStore {
    private List<Book> books;

    public BookStore(List<Book> books) {
        this.books = books;
    }

    public Integer getNumberOfBooks() {
        return books.stream().mapToInt(e -> e.getPieces()).sum();
    }

    public Optional<Book> findNewestBook() {
        return books.stream().sorted(Comparator.comparing(Book::getYearOfPublish).reversed()).findFirst();
    }

    public Integer getTotalValue() {
        return books.stream().reduce(0, (a, b) -> a + b.getPrice() * b.getPieces(), (x, y) -> x + y);
    }
}
