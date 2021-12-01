package methodvarargs.examstats;

public class ExamStats {
    private int maximumPoints;

    public ExamStats(int maxPoints) {
        this.maximumPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("no exam results");
        }
        int limitInPoints = (int)(maximumPoints/100.0*limitInPercent);
        int counter = 0;
        for (int result : results
        ) {
            if (result > limitInPoints) {
                counter++;
            }
        }
        return counter;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("no exam results");
        }
        int limitInPoints = (int)(maximumPoints/100.0*limitInPercent);
        for (int result : results
        ) {
            if (result < limitInPoints) {
                return true;
            }
        }
        return false;
    }
}
