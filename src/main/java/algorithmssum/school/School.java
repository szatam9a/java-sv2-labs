package algorithmssum.school;

import java.util.List;

public class School {
    public int getNumbersOfStudents(List<Integer> headcount) {
        int sum = 0;
        for (int i : headcount
        ) {
            sum += i;
        }
        return sum;
    }
}
