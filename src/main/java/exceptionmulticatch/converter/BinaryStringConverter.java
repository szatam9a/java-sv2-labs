package exceptionmulticatch.converter;

public class BinaryStringConverter {
    public boolean[] binaryStringToBooleanArray(String string) {
        throwExOnNull(string);
        boolean[] result = new boolean[string.length()];
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != '1' && string.charAt(i) != '0')
                throw new IllegalArgumentException("Binary string is not valid.");
            result[i] = string.charAt(i) == '1';
        }
        return result;
    }

    public String booleanArrayToBinaryString(boolean[] booleanArray) {
        throwExOnNull(booleanArray);
        if (booleanArray.length == 0)
            throw new IllegalArgumentException("The array is empty");
        StringBuilder sb = new StringBuilder();
        for (boolean truth : booleanArray) {
            if (truth)
                 sb.append(1);
            else sb.append(0);
        }
        return sb.toString();
    }

    private void throwExOnNull(Object o) {
        if (o == null) throw new NullPointerException("the parameter is null ");
    }
}