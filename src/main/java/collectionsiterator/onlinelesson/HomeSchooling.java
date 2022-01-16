package collectionsiterator.onlinelesson;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HomeSchooling {
    private List<OnlineLesson> lessons = new ArrayList<>();

    public HomeSchooling() {
    }


    public void addNewLesson(OnlineLesson lesson) {
        Iterator<OnlineLesson> it = lessons.listIterator();
        int defIndex;
        int indCounter = 0;
        while (it.hasNext()) {
            OnlineLesson before = it.next();
            if (lesson.getTime().isBefore(before.getTime())) {
                lessons.add(indCounter, lesson);
                return;
            }
            indCounter++;
        }
        defIndex = indCounter;
        lessons.add(defIndex, lesson);
    }

    public List<OnlineLesson> getLessonsByTitle(String title) {
        if (title == null) throw new IllegalArgumentException("null string");
        List<OnlineLesson> resultOfSearch = new LinkedList<>();
        OnlineLesson next;
        Iterator<OnlineLesson> it = lessons.listIterator();

        while (it.hasNext()) {
            next = it.next();
            if (title.equals(next.getClassName())) {
                resultOfSearch.add(next);
            }
        }
        return resultOfSearch;
    }

    public void removeLesson(LocalDateTime time) {
        Iterator<OnlineLesson> it = lessons.listIterator();
        while (it.hasNext()) {
            OnlineLesson next = it.next();
            if (next.getTime().equals(time)) {
                it.remove();
            }
        }
    }

    public List<OnlineLesson> getLessons() {
        return lessons;
    }

    public HomeSchooling(List<OnlineLesson> lessons) {
        this.lessons = lessons;
    }
}
