package introexceptionfirstexception;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Cinema {
    private String name;
    private String movieToWatch;
    private int tickets;
    private int row;

    public void ReadIn(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Neved?");
        setName(scanner.nextLine());
        System.out.println("film címe?");
        setMovieToWatch(scanner.nextLine());
        System.out.println("hány jegy kell?");
        setTickets(scanner.nextInt());
        System.out.println("sor?");
        setRow(scanner.nextInt());
    }

    public void WriteOut(){
        System.out.printf("Vásárló neve: %s \n  Film címe: %s \n " ,name ,movieToWatch);
        System.out.printf("lefoglalt helyek: ");
        for (int i=1 ;i<=tickets;i++){
            System.out.print(row +". sor " +i+". szék, ");
        }

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovieToWatch() {
        return movieToWatch;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setMovieToWatch(String movieToWatch) {
        this.movieToWatch = movieToWatch;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.ReadIn();
        cinema.WriteOut();
    }
}
