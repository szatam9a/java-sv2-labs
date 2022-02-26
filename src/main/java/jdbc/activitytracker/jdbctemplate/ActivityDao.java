package jdbc.activitytracker.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;


public class ActivityDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
//
//    private int id;
//    private LocalDateTime startTime;
//    private String description;
//    private Type type;
//    private List<TrackPoint> trackPoints;

    public void saveActivity(LocalDateTime starTime, String description, String type) {
        jdbcTemplate.update("insert into activities(start_time,description,activity_type) values(?,?,?)", starTime.toLocalDate(), description, type);
    }


    public jdbc.activitytracker.Activity findActivityById(Long id) {
        jdbc.activitytracker.Activity result;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("select * from activities where id = ? ")) {
            preparedStatement.setLong(1, id);
            preparedStatement.executeQuery();
            ResultSet rs = preparedStatement.getResultSet();
            rs.next();
            result = new jdbc.activitytracker.Activity(rs.getInt("id"), rs.getTimestamp("start_time").toLocalDateTime(), rs.getString("description"), jdbc.activitytracker.Type.valueOf(rs.getString("activity_type")));
            rs.close();
        } catch (SQLException sqlException) {
            throw new IllegalStateException("sql " + sqlException);
        }
        return result;
    }

    public List<jdbc.activitytracker.Activity> listActivities() {
        List<jdbc.activitytracker.Activity> result = new LinkedList<>();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("select * from activities")) {
            statement.executeQuery();
            ResultSet rs = statement.getResultSet();
            while (rs.next()) {
                result.add(newActivityByResultSet(rs));
            }
            rs.close();
        } catch (SQLException sqlException) {
            throw new IllegalStateException("no sql" + sqlException);
        }

        return result;
    }

    private jdbc.activitytracker.Activity newActivityByResultSet(ResultSet rs) throws SQLException {
        return new Activity(rs.getInt("id"), rs.getTimestamp("start_time").toLocalDateTime(), rs.getString("description"), Type.valueOf(rs.getString("activity_type")));
    }
}
