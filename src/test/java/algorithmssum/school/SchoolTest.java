package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void getNumbersOfStudents() {
            School school = new School();
            assertEquals(10, school.getNumbersOfStudents(Arrays.asList(1,9)));
    }
}