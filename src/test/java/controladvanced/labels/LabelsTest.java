package controladvanced.labels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LabelsTest {

    @Test
    void testASpecificNumberInTheArray(){
        Labels labels = new Labels();
        assertEquals(2,labels.getTableOfNumbers(10)[0][0]);
        assertEquals(3,labels.getTableOfNumbers(10)[0][1]);
        assertEquals(4,labels.getTableOfNumbers(10)[0][2]);
        assertEquals(5,labels.getTableOfNumbers(10)[0][3]);
        assertEquals(12,labels.getTableOfNumbers(10)[5][5]);
    }
}