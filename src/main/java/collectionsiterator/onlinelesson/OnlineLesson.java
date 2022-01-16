package collectionsiterator.onlinelesson;

import java.time.LocalDateTime;

public class OnlineLesson {
    private String teacherName;
    private String className;
    private LocalDateTime time;

    public OnlineLesson(String teachersName, String className, LocalDateTime time) {
        this.teacherName = teachersName;
        this.className = className;
        this.time = time;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getClassName() {
        return className;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public boolean amIAfterThis(OnlineLesson ol) {
        if (this.time.isEqual(ol.time)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "OnlineLesson{" +
                "time=" + time +
                '}';
    }
}
