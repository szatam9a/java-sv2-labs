package statements;
import java.util.Random;
public class DivByThree {
    public static void main(String[] args) {
        Random rng = new Random();

        int z = rng.nextInt(50);
        System.out.println(z);
        System.out.println(z%3==0);
    }
}
