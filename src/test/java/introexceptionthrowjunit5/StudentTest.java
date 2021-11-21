package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testAddNote(){
        Student student = new Student();
        student.addNote(3);
        assertEquals(3,student.getListElement(0));
    }
    @Test
    void testAddNoteThrow(){
        Student student = new Student();

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
        ()-> student.addNote(6));
        assertEquals("Note must be between 1 and 5!",exception.getMessage());


    }
}