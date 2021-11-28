package algorithmstransformation.student;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolTest {

    @Test
    void getStudentsTest() {
        PrimarySchool primarySchool = new PrimarySchool(Arrays.asList(
                new Person("jhon",8,"a"),
                new Person("jhon",35,"a"),
                new Person("jhon",15,"a"),
                new Person("jhon",10,"a"),
                new Person("jhon",2,"a")
        ));

        assertEquals(2,primarySchool.getStudents().size());
    }
}