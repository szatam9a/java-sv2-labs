package jdbc.activitytracker.jdbctemplate;

public enum Type {
    BIKING, HIKING, RUNNING,
    BASKETBALL;

    @Override
    public String toString() {
        return "Type{}";
    }
}
