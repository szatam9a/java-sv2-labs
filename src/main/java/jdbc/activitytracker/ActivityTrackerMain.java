package jdbc.activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class ActivityTrackerMain {
    public static void main(String[] args) {
        List<Activity> activityList = new LinkedList<>();
        activityList.add(new Activity(LocalDateTime.now(), "nothing", Type.HIKING));
        activityList.add(new Activity(LocalDateTime.now(), "OkeyDoke", Type.BIKING));
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


        //activityList.stream().forEach(e -> e.putIntoDatabase(dataSource));
//        ActivityTracker activityTracker = new ActivityTracker(dataSource);
//        List<Activity> allDataInDataBase = activityTracker.allActivity();
//        for (Activity actual : allDataInDataBase) {
//            System.out.println(actual);
//            System.out.println(activityTracker.findActivityByID(actual.getId()));
//        }


    }
}
