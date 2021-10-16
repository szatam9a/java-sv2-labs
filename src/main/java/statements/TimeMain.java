package statements;

public class TimeMain {
    public static void main(String[] args) {
        Time timeearlier = new Time(16,10,10);
        Time timelater = new Time( 17, 20 ,30);
        System.out.println(timeearlier.earlierThan(timelater));
     }
}
