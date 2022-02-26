package jdbc.activitytracker.jdbctemplate;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class ActivityTrackerMain {
    public static void main(String[] args) {
        List<jdbc.activitytracker.jdbctemplate.Activity> activityList = new LinkedList<>();
        activityList.add(new jdbc.activitytracker.jdbctemplate.Activity(LocalDateTime.now(), "OkeyDoke", jdbc.activitytracker.jdbctemplate.Type.BIKING));
        activityList.add(new jdbc.activitytracker.jdbctemplate.Activity(LocalDateTime.now(), "Nope", jdbc.activitytracker.jdbctemplate.Type.BIKING));
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
        flyway.migrate();
        ActivityDao activityDao = new ActivityDao(dataSource);
        activityDao.saveActivity(LocalDateTime.now(),"okey",Type.HIKING);
        activityDao.listActivities().stream().forEach(System.out::println);
        System.out.println(activityDao.findActivityById(1L).get());
    }
}
