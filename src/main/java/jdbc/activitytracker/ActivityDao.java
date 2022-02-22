package jdbc.activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class ActivityDao {
    private DataSource dataSource;

    public void saveActivity(Activity activity) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("insert into activities(start_time, description,activity_type) values(?,?,?)", Statement.RETURN_GENERATED_KEYS)
        ) {

            preparedStatement.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            preparedStatement.setString(2, activity.getDescription());
            preparedStatement.setString(3, activity.getType().toString());
            preparedStatement.executeUpdate();

            try (ResultSet rs = preparedStatement.getGeneratedKeys();) {
                if (rs.next()) {
                    activity.setId(rs.getInt(1));
                } else throw new IllegalArgumentException("cant get id");
            }
        } catch (SQLException sqlException) {
            throw new IllegalArgumentException("sql" + sqlException);
        }
    }


    public Activity findActivityById(Long id) {
        Activity result;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("select * from activities where id = ? ")) {
            preparedStatement.setLong(1, id);
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

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Activity> listActivities() {
        List<Activity> result = new LinkedList<>();
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

    private Activity newActivityByResultSet(ResultSet rs) throws SQLException {
        return new Activity(rs.getInt("id"), rs.getTimestamp("start_time").toLocalDateTime(), rs.getString("description"), Type.valueOf(rs.getString("activity_type")));
    }
}
