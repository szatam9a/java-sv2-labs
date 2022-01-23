package lambda;

import java.util.LinkedList;
import java.util.List;

public class Remainder {
    public List<Integer> changeNumbersToRemainders(List<Integer> numbers, int divisor) {
        List<Integer> result = new LinkedList<>(numbers);
        result.replaceAll(number -> number % divisor);
        return result;
    }
}
