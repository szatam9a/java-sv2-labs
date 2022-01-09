package collectionsautoboxing.vote;

import java.util.HashMap;
import java.util.Map;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> votes) {
        Map<VoteResult, Integer> result = new HashMap<>();
        initVoteCounter(result);

        for (VoteResult v : votes.values()) {
            result.put(v, result.get(v) + 1);
        }
        return result;
    }

    private Map<VoteResult, Integer> initVoteCounter(Map<VoteResult, Integer> votes) {
        for (VoteResult v : VoteResult.values()) {
            votes.put(v, 0);
        }
        return votes;
    }
}
