package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {

    @Test
    void getTodayReferringStudentTest() {
        ClassFiveA classA = new ClassFiveA();
        String name = classA.getTodayReferringStudent(2);
        assertEquals("Joó Lilla", name);
    }

    @Test
    void testGetTodayReferringStudentTest() {
        ClassFiveA classA = new ClassFiveA();
        assertEquals("Gárdos Helga", classA.getTodayReferringStudent(Number.ONE));
    }

    @Test
    void testGetTodayReferringStudent1Test() {
        ClassFiveA classA = new ClassFiveA();
        assertEquals("Gárdos Helga", classA.getTodayReferringStudent("one"));
    }
}