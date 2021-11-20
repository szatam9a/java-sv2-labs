package controliteration.day;

import java.util.List;

public class Day {
    private List<Hour> hoursOfDay;

    public void addHour(Hour hour){
        hoursOfDay.add(hour);
    }
    public List<Hour> getHoursOfDay() {
        return hoursOfDay;
    }
    public void setDayPeriod(){
        for (Hour actual:hoursOfDay
             ) {
            if ((actual.getHourNumbers()>6) && (actual.getHourNumbers()<22)) {
                actual.setPeriod(DayPeriod.DAYTIME);
            } else {
                actual.setPeriod(DayPeriod.NIGHTTIME);
            }
        }
    }
}
