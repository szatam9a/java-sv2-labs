package methodvarargs.gps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HikingTour {
    private List<FieldPoint> fieldPointList = new ArrayList<>();

    public void logFieldPoints(LocalDateTime timeOfLogging, FieldPoint... fieldPointsToLog) {
        if (timeOfLogging == null) {
            throw new IllegalArgumentException("The time of logging is null!");
        }
        for (FieldPoint f : fieldPointsToLog
        ) {
            fieldPointList.add(f);
            f.setTimeOfLogging(timeOfLogging);
        }
    }

    public List<FieldPoint> getFieldPointList() {
        return fieldPointList;
    }
}
