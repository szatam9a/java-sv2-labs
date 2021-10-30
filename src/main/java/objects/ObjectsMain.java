package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {
        new Book();
        System.out.println(new Book());
        Book emptyBook = new Book();
        System.out.println(emptyBook);
        emptyBook = null;
        //System.out.println(emptyBook == (null));
        Book book = new Book();
        Book anotherBook = new Book();
        //System.out.println(book==anotherBook);
        anotherBook=book;
        //System.out.println(book==anotherBook);

        Book[] array = new Book[]{emptyBook, book, anotherBook};
        List<Book> list = Arrays.asList(emptyBook, book, anotherBook);
        List<Book> list1 = new ArrayList<>();
        list1.add(book);
        list1.add(anotherBook);
        list1.add(emptyBook);

        System.out.println(list1.toString());
        System.out.println(list.toString());
        System.out.println(Arrays.toString(array));
    }
}
