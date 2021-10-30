package introconstructors;

import java.time.LocalDateTime;

public class Task {
    private String title;
    private String description;
    private int duration;
    private LocalDateTime startDateTime;

    public void start() {
        startDateTime = LocalDateTime.now();
        //System.out.println(startDateTime);
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
