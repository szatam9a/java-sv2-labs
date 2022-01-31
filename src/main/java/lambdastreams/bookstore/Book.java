package lambdastreams.bookstore;

public class Book {
    private String title;
    private int YearOfPublish;
    private int price;
    private int pieces;

    public Book(String title, int releaseYear, int price, int pieces) {
        this.title = title;
        this.YearOfPublish = releaseYear;
        this.price = price;
        this.pieces = pieces;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublish() {
        return YearOfPublish;
    }

    public int getPrice() {
        return price;
    }

    public int getPieces() {
        return pieces;
    }
}
