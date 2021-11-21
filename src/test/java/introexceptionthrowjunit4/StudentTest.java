package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class StudentTest {

    private Student student = new Student();

    @Test
    public void testAddNote() {
        student.addNote(3);
        assertEquals(3, student.getListElement(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNoteThrow() {
        student.addNote(6);
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testAddNoteThrowRule() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Note must be between 1 and 5!");
        student.addNote(6);
    }

    @Test
    public void testAddNoteThrowAssert() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> student.addNote(6));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());

    }

}