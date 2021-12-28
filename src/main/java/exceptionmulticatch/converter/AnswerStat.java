package exceptionmulticatch.converter;

public class AnswerStat {
    private BinaryStringConverter converter;

    public AnswerStat(BinaryStringConverter converter) {
        this.converter = converter;
    }

    public boolean[] convert(String string) {
        try {
            return converter.binaryStringToBooleanArray(string);
        } catch (NullPointerException | IllegalArgumentException exception) {
            throw new InvalidBinaryStringException(exception);
        }
    }

    public int answerTruePercent(String answers) {
        int sumTrue = 0;
        boolean[] array = convert(answers);
        for (int i = 0; i < array.length; i++) {
            if (array[i]) sumTrue++;
        }
        return (int) ((double)sumTrue/ array.length*100.0);
    }
}
