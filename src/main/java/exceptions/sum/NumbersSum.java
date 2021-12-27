package exceptions.sum;

public class NumbersSum {
    public int getSum(int[] numbers) {
        isTheObjectNull(numbers);
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

    public int getSum(String[] numbers) {
        isTheObjectNull(numbers);
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            try {
                result += Integer.parseInt(numbers[i]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("cant parseInt an element in the string array");
            }
        }
        return result;
    }


    public boolean isTheObjectNull(Object o) {
        if (o == null) {
            throw new IllegalArgumentException("the parameter is null");
        } else return false;
    }


}
