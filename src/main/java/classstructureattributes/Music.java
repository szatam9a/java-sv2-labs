package classstructureattributes;
import java.util.Scanner;
public class Music {
    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);
        System.out.println("kedvenc elóadód neve?");
        song.band = scanner.nextLine();
        System.out.println("kedvenc dalod neve?");
        song.title = scanner.nextLine();
        System.out.println("mennyi perc hosszú a dal?");
        song.length = scanner.nextInt();
        scanner.nextLine();
        System.out.println(song.band+" - " + song.title+" (" +song.length +" perc)");
        System.out.println("Az én kedvenc előadóm is a " + song.band);
        System.out.println("Kedvenc dalod neve: " + song.title);
        System.out.println("kedvenc dalod "+ song.length + " perc hosszú");

    }
}
