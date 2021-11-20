package introexceptiontrace.numbers;

import java.util.Random;

public class RandomOperations {
    private Random random = new Random();

    public int[] getNumbers() {
        int lengthOfArray = random.nextInt(10) + 1;
        int[] numbers = new int[lengthOfArray];
        for (int i = 0; i <= lengthOfArray; i++) {
            numbers[i] = random.nextInt(100); // itt keletkezik " Index 2 out of bounds for length 2" 2elemü tömbnél az utlsó index 1 lesz.
        }
        return numbers;
    }
}
