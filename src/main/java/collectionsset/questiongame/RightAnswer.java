package collectionsset.questiongame;

import java.util.Objects;

public class RightAnswer {
    private String playersName;

    public RightAnswer(String playersName) {
        this.playersName = playersName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RightAnswer)) return false;
        RightAnswer that = (RightAnswer) o;
        return Objects.equals(playersName, that.playersName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playersName);
    }

    public String getPlayersName() {
        return playersName;
    }
}
