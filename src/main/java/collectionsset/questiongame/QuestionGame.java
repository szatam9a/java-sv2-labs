package collectionsset.questiongame;

import java.util.*;

public class QuestionGame {
    private List<RightAnswer> rightAnswers = new ArrayList<>();

    public QuestionGame(List<RightAnswer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public QuestionGame() {
    }

    public Set<String> drawWinners() {
        HashSet<String> winners = new HashSet<>();
        int winCounter = 0;
        Random random = new Random();
        RightAnswer tempAnswer;
        while (winCounter < 5) {
            checkIfThereIsEmptyListAKALessThanFiveWinners();
            tempAnswer = getRightAnswer(random);
            if (winners.add(tempAnswer.getPlayersName())) {
                winCounter++;
            }
        }
        return winners;
    }

    private RightAnswer getRightAnswer(Random random) {
        RightAnswer tempAnswer;
        tempAnswer = (rightAnswers.get(random.nextInt(rightAnswers.size())));
        rightAnswers.remove(tempAnswer);
        return tempAnswer;
    }

    public List<RightAnswer> getRightAnswers() {
        return rightAnswers;
    }

    public void setRightAnswers(List<RightAnswer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }
    private void checkIfThereIsEmptyListAKALessThanFiveWinners(){
        if (rightAnswers.size() == 0) {
            throw new IllegalArgumentException("cant reach 5 winners");
        }
    }
}
