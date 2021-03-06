package jdbc.activitytracker.jdbctemplate;

import jdbc.activitytracker.TrackPoint;

import java.time.LocalDateTime;
import java.util.List;

public class Activity {
    private int id;
    private LocalDateTime startTime;
    private String description;
    private jdbc.activitytracker.jdbctemplate.Type type;
    private List<TrackPoint> trackPoints;

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", description='" + description + '\'' +
                ", type=" + type +
                '}';
    }

    public Activity(int id, LocalDateTime startTime, String description, jdbc.activitytracker.jdbctemplate.Type type) {
        this.id = id;
        this.startTime = startTime;
        this.description = description;
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(jdbc.activitytracker.jdbctemplate.Type type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getDescription() {
        return description;
    }

    public jdbc.activitytracker.jdbctemplate.Type getType() {
        return type;
    }

    public Activity(LocalDateTime startTime, String description, Type type) {

        this.startTime = startTime;
        this.description = description;
        this.type = type;
    }
}
