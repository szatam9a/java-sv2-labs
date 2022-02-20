package jdbc.activitytracker;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class ActivityTracker {
    private DataSource dataSource;

    public ActivityTracker(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Activity> allActivity() {
        List<Activity> result = new LinkedList<>();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("select * from activities")) {
            statement.executeQuery();
            ResultSet rs = statement.getResultSet();
            while (rs.next()) {
                result.add(new Activity(rs.getInt("id"), rs.getTimestamp("start_time").toLocalDateTime(), rs.getString("description"), Type.valueOf(rs.getString("activity_type"))));
            }
            rs.close();
        } catch (SQLException sqlException) {
            throw new IllegalStateException("no sql" + sqlException);
        }

        return result;
    }

    public Activity findActivityByID(int id) {
        Activity result;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("select * from activities where id = ? ")) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeQuery();
            ResultSet rs = preparedStatement.getResultSet();
            rs.next();
            result = new Activity(rs.getInt("id"), rs.getTimestamp("start_time").toLocalDateTime(), rs.getString("description"), Type.valueOf(rs.getString("activity_type")));
            rs.close();
        } catch (SQLException sqlException) {
            throw new IllegalStateException("sql " + sqlException);
        }
        return result;
    }
}
