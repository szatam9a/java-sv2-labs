package jdbc.activitytracker;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Activity {
    private int id;
    private LocalDateTime startTime;
    private String description;
    private Type type;

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", description='" + description + '\'' +
                ", type=" + type +
                '}';
    }

    public Activity(int id, LocalDateTime startTime, String description, Type type) {
        this.id = id;
        this.startTime = startTime;
        this.description = description;
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

    public Type getType() {
        return type;
    }

    public Activity(LocalDateTime startTime, String description, Type type) {

        this.startTime = startTime;
        this.description = description;
        this.type = type;
    }

    public void putIntoDatabase(DataSource dataSource) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("insert into activities(start_time, description,activity_type) values(?,?,?)")
        ) {
            preparedStatement.setTimestamp(1, Timestamp.valueOf(this.getStartTime()));
            preparedStatement.setString(2, this.getDescription());
            preparedStatement.setString(3, this.getType().toString());
            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            throw new IllegalArgumentException("sql" + sqlException);
        }
    }
}
