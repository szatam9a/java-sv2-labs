package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ChessTournamentTest {

    @Test
    void addPlayersToTeamsTest() {
        ChessTournament ct = new ChessTournament();
        ct.addPlayersToTeams(Arrays.asList(new Player(), new Player(), new Player(), new Player(), new Player(),
                new Player(), new Player(), new Player(), new Player(), new Player()
        ));
        ct.getTeams().get(0).getPlayerOne().setName("Joe");
        Player joe = ct.getTeams().get(0).getPlayerOne();
        assertEquals("Joe" , joe.getName());
    }

    @Test
    void getTeamsTest() {
        ChessTournament ct = new ChessTournament();
        assertEquals(3,ct.getTeams().size());
    }
}