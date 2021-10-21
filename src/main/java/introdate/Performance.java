package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Performance {
    private LocalDate date;
    private String artist;
    private LocalTime starTime;
    private LocalTime endTime;

    public Performance(LocalDate date, String artist, LocalTime starTime, LocalTime endTime) {
        this.date = date;
        this.artist = artist;
        this.starTime = starTime;
        this.endTime = endTime;
    }
    public String getInfo(){
        return this.artist + " " +
               this.date + " " +
               this.starTime + " - " +
               this.endTime;
    }
    public LocalDate getDate() {
        return date;
    }
    public String getArtist() {
        return artist;
    }
    public LocalTime getStarTime() {
        return starTime;
    }
    public LocalTime getEndTime() {
        return endTime;
    }
}
