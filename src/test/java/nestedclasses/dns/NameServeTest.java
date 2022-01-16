package nestedclasses.dns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameServeTest {

    @Test
    void addEntryTest() {
        NameServer nameServer = new NameServer();
        nameServer.addEntry("something", "1990");
        assertEquals(1, nameServer.getEntries().size());
        nameServer.removeEntryByName("something");
        assertEquals(0, nameServer.getEntries().size());
        nameServer.addEntry("something", "1990");
        assertEquals(1, nameServer.getEntries().size());
        nameServer.removeEntryByIp("1990");
        assertEquals(0, nameServer.getEntries().size());
    }
}