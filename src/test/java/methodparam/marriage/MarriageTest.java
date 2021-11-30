package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {

    @Test
    void getMarriedTest() {
        Woman woman = new Woman("Nagy", new ArrayList<>(Arrays.asList(
                new RegisterDate("születés ideje", LocalDate.of(1, 1, 1)),
        new RegisterDate("házasságkötés", LocalDate.of(2, 1, 1))
        )));

        Man man = new Man("Kiss", new ArrayList<>(Arrays.asList(
                new RegisterDate("születés", LocalDate.of(1, 1, 1)),
                new RegisterDate("házasságkötés", LocalDate.of(2, 1, 1)),
                new RegisterDate("válás", LocalDate.of(3, 1, 1))
        )));

        Marriage marriage = new Marriage();
        marriage.getMarried(woman, man);

        assertEquals("Kiss-Nagy", woman.getName());
        assertEquals(4, man.getRegisterDates().size());
    }
}