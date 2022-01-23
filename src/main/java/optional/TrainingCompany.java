package optional;

import java.util.List;
import java.util.Optional;

public class TrainingCompany {
    private List<Course> courses;

    public TrainingCompany(List<Course> courses) {
        this.courses = courses;
    }

    public Course getCheaperCourse(int maxPrice) {
        Optional<Course> course = Optional.empty();
        for (Course c : courses) {
            if (c.getPrice() <= maxPrice) {
                course = Optional.of(c);
            }
        }
        return course.orElseThrow(() -> new IllegalArgumentException("No such course."));
    }

    public int getPriceOfCourseWithGivenNameAndLevel(String name, Level level) {
        Optional<Integer> course = Optional.empty();
        for (Course c : courses) {
            if (c.getName().equals(name) && c.getIntensity().equals(level)) {
                course = Optional.of(c.getPrice());
            }
        }
        return course.orElseThrow(() -> new IllegalArgumentException("No such course."));
    }

    public String getNameOfCourseWithGivenLevel(Level level) {
        Optional<String> course = Optional.empty();
        for (Course c : courses) {
            if (c.getIntensity().equals(level)) {
                course = Optional.of(c.getName());
            }
        }
        return course.orElseThrow(() -> new IllegalArgumentException("Sorry, there is no course at this level."));
    }
}
