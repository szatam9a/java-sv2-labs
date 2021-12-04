package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassRoomTest {

    @Test
    void isSuitableTest() {
        ClassRoom crNoFit = new ClassRoom("Location",30, Facility.COMPUTERS);
        ClassRoom crFit = new ClassRoom("Location",30,Facility.PROJECTOR);
        Course watchMovie = new Course(30,Facility.PROJECTOR);
        assertTrue(crFit.isSuitable(watchMovie));
        assertFalse(crNoFit.isSuitable(watchMovie));
    }
}