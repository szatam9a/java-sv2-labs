package exceptionclass.course;

public class SimpleTime {
    private int hour;
    private int minute;

    public SimpleTime(int hours, int minutes) {
        invalidHourCheck(hours);
        invalidMinuteCheck(minutes);
        this.hour = hours;
        this.minute = minutes;
    }

    public SimpleTime(String hours, String minutes) {
        checkToNull(hours, minutes);
        invalidHourCheck(hours);
        invalidMinuteCheck(minutes);
        this.hour = Integer.parseInt(hours);
        this.minute = Integer.parseInt(minutes);
    }

    private void invalidHourCheck(int hours) {
        if (hours < 0 || hours > 23) {
            throw new InvalideTimeException("Hour is invalid (0-23)");
        }
    }

    private void invalidHourCheck(String hours) {
        try {
            if (Integer.parseInt(hours) < 0 || (Integer.parseInt(hours) > 23)) {
                throw new InvalideTimeException("Hour is invalid (0-23)");
            }
        } catch (NumberFormatException nfe) {
            throw new InvalideTimeException("Time is not hh:mm");
        }
    }

    private void invalidMinuteCheck(int minutes) {
        if (minutes > 59 || minutes < 0) {
            throw new InvalideTimeException("Minute is invalid (0-59)");
        }
    }

    private void invalidMinuteCheck(String minutes) {

        try {
            if (Integer.parseInt(minutes) > 59 || (Integer.parseInt(minutes) < 0)) {
                throw new InvalideTimeException("Minute is invalid (0-59)");
            }
        } catch (NumberFormatException nfe) {
            throw new InvalideTimeException("Time is not hh:mm");
        }
    }

    private void checkToNull(String s1, String s2) {
        if ((s1 == null || s1.length() == 0) || (s2 == null || s2.length() == 0)) {
            throw new InvalideTimeException("Time is null");
        }
    }

    @Override
    public String toString() {
        return hour +
                ":" + minute;
    }
}
