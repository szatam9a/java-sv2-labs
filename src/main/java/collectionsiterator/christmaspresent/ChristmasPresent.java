package collectionsiterator.christmaspresent;

public class ChristmasPresent {
    private String description;
    private String forWho;
    private int price;

    public int getPrice() {
        return price;
    }

    public ChristmasPresent(String description, String forWho, int price) {
        this.description = description;
        this.forWho = forWho;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String getForWho() {
        return forWho;
    }
}
