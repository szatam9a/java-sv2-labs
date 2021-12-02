package methodoverloading;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
    }
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public boolean isEqual(Time time) {
        if (this.convert() == time.convert()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEqual(int hours, int minutes, int seconds) {
        if (this.convert() == convert(hours, minutes, seconds)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEarlier(Time time) {
        if (this.convert() > time.convert()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEarlier(int hours, int minutes, int seconds) {
        if (this.convert() > convert(hours,minutes,seconds)) {
            return true;
        } else {
            return false;
        }
    }

    private int convert() {
        return this.hours * 60 + this.minutes * 60 + this.seconds;
    }

    private int convert(int hours, int minutes, int seconds) {
        return hours * 60 + minutes * 60 + seconds;
    }
}
