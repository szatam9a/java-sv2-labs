package collectionsset;

import collectionsset.questiongame.QuestionGame;
import collectionsset.questiongame.RightAnswer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;


class QuestionGameTest {

    @Test
    void drawWinnersTest() {
        List<RightAnswer> toTest = new ArrayList<>(List.of(new RightAnswer("Toni"), new RightAnswer("Toni"), new RightAnswer("Toti"),
                new RightAnswer("Toto"), new RightAnswer("Tati"), new RightAnswer("Tozi")));
        QuestionGame qg = new QuestionGame(toTest);
        System.out.println(qg.drawWinners());

    }

    @Test
    void drawWithException() {
        List<RightAnswer> toTest = new ArrayList<>(List.of(new RightAnswer("Toni"), new RightAnswer("Toni"), new RightAnswer("Toni"),
                new RightAnswer("Toto"), new RightAnswer("Tati"), new RightAnswer("Tozi")));
        QuestionGame qg = new QuestionGame(toTest);
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> qg.drawWinners());
        Assertions.assertEquals("cant reach 5 winners",iae.getMessage());
    }
}