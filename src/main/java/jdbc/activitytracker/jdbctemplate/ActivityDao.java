package jdbc.activitytracker.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


public class ActivityDao {
    private DataSource dataSource;
    private org.springframework.jdbc.core.JdbcTemplate jdbcTemplate;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public void saveActivity(LocalDateTime starTime, String description, Type type) {
        jdbcTemplate.update("insert into activities(start_time,description,activity_type) values(?,?,?)",
                starTime.toLocalDate(), description, type.toString());
    }


    public Optional<Activity> findActivityById(Long id) {
        return Optional.of(jdbcTemplate.queryForObject("select * from activities where id = ?", (rs, rowNum) -> new Activity(rs.getInt("id"),
                rs.getTimestamp("start_time").toLocalDateTime(),
                rs.getString("description"),
                Type.valueOf(rs.getString("activity_type"))),id));
    }

    public List<Activity> listActivities() {
        return jdbcTemplate.query("select * from activities", (rs, rowNum) -> new Activity(rs.getInt("id"),
                rs.getTimestamp("start_time").toLocalDateTime(),
                rs.getString("description"),
                Type.valueOf(rs.getString("activity_type"))));
    }
}
