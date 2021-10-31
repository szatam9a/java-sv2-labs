package typeconversion;

public class ConversionMain {
    public static void main(String[] args) {
        Conversion convert = new Conversion();
        convert.convertIntArrayToByteArray(new int[]{5, -14, 6, 2, 125, 354, 9738, 3});
        convert.getFirstDecimal(5.64510);
    }
}
