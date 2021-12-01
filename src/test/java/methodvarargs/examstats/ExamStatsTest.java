package methodvarargs.examstats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamStatsTest {

    @Test
    void getNumberOfTopGradesTest() {
        ExamStats exam = new ExamStats(100);
        int toTest = exam.getNumberOfTopGrades(70,10,20,30,40,50,60,70,80,90,100);
        assertEquals(3,toTest);
    }

    @Test
    void hasAnyFailedTest() {
        ExamStats exam = new ExamStats(100);
        boolean toTest =exam.hasAnyFailed(70,10,20,30,40,50,60,70,80,90,100);
        assertTrue(toTest);
    }
    @Test
    void emptyExamResults(){
        ExamStats exam = new ExamStats(100);
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                ()-> exam.hasAnyFailed(10));
        assertEquals("no exam results", iae.getMessage());
        IllegalArgumentException iae2 = assertThrows(IllegalArgumentException.class,
                ()-> exam.getNumberOfTopGrades(10));
    }
}