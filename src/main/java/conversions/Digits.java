package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {
    List<Integer> numbers = new ArrayList<>();

    public void addDigitsToList(String text) {
        String temp = "";
        for (char i : text.toCharArray()
        ) {
            if (Character.isDigit(i) == true) {
                temp = ""+ i;
                numbers.add(Integer.parseInt(temp));};

            }
        }


    public List<Integer> getNumbers() {
        return numbers;
    }

    public static void main(String[] args) {
        Digits digits = new Digits();
        digits.addDigitsToList("néla 1212");
        System.out.println(digits.getNumbers());
    }
}
