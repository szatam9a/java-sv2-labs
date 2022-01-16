package searching;

public class Book implements Comparable<Book> {
    private int id;
    private String title;
    private String author;

    @Override
    public int compareTo(Book o) {
        if (this.author.compareTo(o.author) == 0) {
            return this.title.compareTo(o.title);
        }
        return this.author.compareTo(o.author);
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

}
