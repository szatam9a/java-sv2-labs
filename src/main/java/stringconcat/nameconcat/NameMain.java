package stringconcat.nameconcat;

public class NameMain {
    public static void main(String[] args) {
        Name name = new Name("Smith","Big","Jhon", Title.Dr);
        System.out.println(name.concatNameWesternStyle());
        System.out.println(name.concatNameHungarianStyle());

    }
}
