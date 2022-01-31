package lambdaoptional;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Predicate;

public class Club {
    private List<Member> members = new LinkedList<>();

    public Club(List<Member> members) {
        this.members = members;
    }

    public Optional<Member> findFirst(Predicate<Member> predicate) {
        return members.stream().filter(predicate).findFirst();
    }

    public OptionalDouble averageNumberOfSkills() {
        return members.stream().mapToInt(e -> e.getSkills().size()).average();
    }
}
