package controliteration.day;

public class Hour {
    private int hourNumbers;
    private DayPeriod period ;

    public Hour(int hourNumbers) {
        this.hourNumbers = hourNumbers;
    }

    public int getHourNumbers() {
        return hourNumbers;
    }

    public void setHourNumbers(int hourNumbers) {
        this.hourNumbers = hourNumbers;
    }

    public DayPeriod getPeriod() {
        return period;
    }

    public void setPeriod(DayPeriod period) {
        this.period = period;
    }
}
