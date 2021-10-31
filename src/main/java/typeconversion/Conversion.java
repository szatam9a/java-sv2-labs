package typeconversion;

import java.util.Arrays;

public class Conversion {
    public double convertDoubleToDouble(double number) {
        int cut = (int) number;
        return (double) cut;
    }

    public byte[] convertIntArrayToByteArray(int[] array) {
        byte[] tempArray = new byte[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0 && array[i] <= 127) {
                tempArray[i] = (byte) array[i];
            } else {
                tempArray[i] = -1;
            }
        }
        System.out.println(Arrays.toString(tempArray));
        return tempArray;
    }

    public int getFirstDecimal(double number) {
        int result = (int) number;
        number = (number - result) * 10;
        System.out.println((int) number);
        return (int) number;

    }
}
