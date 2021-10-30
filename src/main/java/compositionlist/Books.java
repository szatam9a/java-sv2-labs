package compositionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {
    List<String> booksTitle = new ArrayList<>();


    public void findBookAndSetAuthor(String title, String author) {
        int titlesIndex = booksTitle.indexOf(title);
        if (titlesIndex>=0)
        {
            booksTitle.set(titlesIndex,(author+": "+ booksTitle.get(titlesIndex)));
        }
    }
    public List<String> getBooksTitle() {
        return booksTitle;
    }

    public void addBook(String title){
        booksTitle.add(title);


    }
    public static void main(String[] args) {
        Books books = new Books();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hány könyvcímet szeretne rögzíteni?");
        int numberOfBooks = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("Kérem, adja meg a(z) " + (i + 1) + ". könyv címét:");
            String title = scanner.nextLine();
            books.addBook(title);
        }
        System.out.println(books.getBooksTitle());
        System.out.println();

        System.out.println("Adja meg a könyv címét, melyhez szerzőt is szeretne rögzíteni:");
        String titleWithAuthor = scanner.nextLine();
        System.out.println("Adja meg a szerző nevét:");
        String author = scanner.nextLine();
        books.findBookAndSetAuthor(titleWithAuthor, author);
        System.out.println(books.getBooksTitle());
    }
}
