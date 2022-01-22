package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lottery {
    public List<Integer> selectWinningNumbers(int lotteryType, int ballsNumber) {
        validate(ballsNumber, lotteryType);
        List<Integer> balls = new ArrayList<>(ballsNumber);
        fillTheList(ballsNumber, balls);
        return pickBalls(lotteryType, balls);
    }

    private List<Integer> pickBalls(int lotteryType, List<Integer> balls) {
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < lotteryType; i++) {
            result.add(balls.get(i));
        }
        Collections.sort(balls);
        return result;
    }

    private void fillTheList(int ballsNumber, List<Integer> balls) {
        for (int i = 0; i < ballsNumber; i++) {
            balls.add(i + 1);
        }
        Collections.shuffle(balls);
    }

    private void validate(int ballsNumber, int lotteryType) {
        if (ballsNumber >= lotteryType)
            throw new IllegalArgumentException("There must be more balls than the winning numbers!");
    }
}
