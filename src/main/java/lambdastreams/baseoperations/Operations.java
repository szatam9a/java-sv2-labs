package lambdastreams.baseoperations;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Operations {
    private List<Integer> integers;

    public Operations(List<Integer> integers) {
        this.integers = integers;
    }

    public List<Integer> getIntegers() {
        return integers;
    }

    public Optional<Integer> min() {
        return integers.stream().min(Comparator.comparingInt(i -> i));
    }

    public Integer sum() {
        return integers.stream().reduce(0, (a, b) -> a + b);
//        return integers.stream().reduce((a, b) -> a + b).get();
    }

    public boolean isAllPositive() {
        return integers.stream().allMatch(e -> e > 0);
    }

    public Set<Integer> getDistinctElements() {
        return integers.stream().distinct().collect(Collectors.toSet());
    }
}
