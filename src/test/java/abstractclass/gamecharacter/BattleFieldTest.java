package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BattleFieldTest {

    @Test
    void fightTest() {
        BattleField bf = new BattleField();
        assertEquals(0,bf.getRound());
        Archer characterArcher = new Archer(new Point(1,1), new Random());
        AxeWarrior characterWarrior =   new AxeWarrior(new Point(3,3), new Random());
        bf.fight(characterArcher,characterWarrior);
        assertTrue(bf.getRound()>0);
        assertTrue(!characterArcher.isAlive() || !characterWarrior.isAlive());
    }
}