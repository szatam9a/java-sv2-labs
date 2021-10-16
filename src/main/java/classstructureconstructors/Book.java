package classstructureconstructors;

public class Book {
    private String author;
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    private String title;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    private int regNumber;
    public int getRegNumber() {
        return regNumber;
    }
    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }
    /*public Book(String author ,String title){
        alt+ insert  konstruktor generálás.
    }
    */

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void register(int number){
        this.regNumber = number;
    }
}
