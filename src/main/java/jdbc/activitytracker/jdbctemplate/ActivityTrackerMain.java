package jdbc.activitytracker.jdbctemplate;

import jdbc.activitytracker.Activity;
import jdbc.activitytracker.Type;
import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class ActivityTrackerMain {
    public static void main(String[] args) {
        List<jdbc.activitytracker.Activity> activityList = new LinkedList<>();
        activityList.add(new jdbc.activitytracker.Activity(LocalDateTime.now(), "nothing", jdbc.activitytracker.Type.HIKING));
        activityList.add(new jdbc.activitytracker.Activity(LocalDateTime.now(), "OkeyDoke", jdbc.activitytracker.Type.BIKING));
        activityList.add(new Activity(LocalDateTime.now(), "Nothing", Type.HIKING));

        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activityTracker?useUnicode=true");
            dataSource.setUserName("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException sqlException) {
            throw new IllegalStateException("sql" + sqlException);
        }
        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

    }
}
