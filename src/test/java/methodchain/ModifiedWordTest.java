package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedWordTest {

    @Test
    void modifyTest() {
        ModifiedWord mod = new ModifiedWord();
        System.out.println(mod.modify("asd"));

    }
}