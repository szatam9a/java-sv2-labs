package collectionsclass;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Exam {
    List<ExamResult> examResults;

    public Exam(List<ExamResult> examResults) {
        this.examResults = examResults;
    }

    public List<String> getNamesOfSucceededPeople(int places) {
        examResults.sort(Comparator.comparingInt(ExamResult::getPoints));
        Collections.reverse(examResults);
        return pick(places);
    }

    private List<String> pick(int places) {
        List<String> result = new LinkedList<>();
        for (int i = 0; i < places; i++) {
            result.add(examResults.get(i).getName());
        }
        return result;
    }
}
