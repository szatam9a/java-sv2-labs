package searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainTest {

    @Test
    void searchPikeTest() {
        Mountain mountain = new Mountain();
        mountain.setPikes(new int[]{1, 2, 3, 4, 5});
        assertTrue(mountain.searchPike(new Pike("jóe", 5)));
    }
}