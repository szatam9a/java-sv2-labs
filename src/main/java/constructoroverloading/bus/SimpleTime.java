package constructoroverloading.bus;

public class SimpleTime {
    private int hours;
    private int minutes;

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(int hours) {
        this(hours, 0);
    }

    public SimpleTime(SimpleTime time) {
        this(time.hours, time.minutes);
    }

    public int getDifference(SimpleTime time) {
        return (this.getAllMinutes() - time.getAllMinutes());
    }

    @Override
    public String toString() {
        return  hours +
                ":" + minutes
               ;
    }

    public int getHours() {
        return hours;
    }

    public int getAllMinutes() {
        return this.hours * 60 + this.minutes;
    }

    public int getMinutes() {
        return minutes;
    }
}
