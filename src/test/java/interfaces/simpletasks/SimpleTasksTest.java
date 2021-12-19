package interfaces.simpletasks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleTasksTest {

    @Test
    void runTest() {
        List<String> toTest =new ArrayList<>(List.of("a","b","c"));
        SimpleTasks st = new SimpleTasks(toTest);
        st.run();
        assertEquals(0,st.getTasks().size());
    }
}