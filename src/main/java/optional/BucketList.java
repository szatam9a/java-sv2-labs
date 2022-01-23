package optional;

import java.util.List;
import java.util.Optional;

public class BucketList {
    private List<Destination> destinationLIst;

    public BucketList(List<Destination> destinationLIst) {
        this.destinationLIst = destinationLIst;
    }

    public Optional<Destination> getDestinationWithKeyword(String keyword) {
        for (Destination d : destinationLIst) {
            if (d.getDescription().contains(keyword)) {
                return Optional.of(d);
            }
        }
        return Optional.empty();
    }

    public Optional<Destination> getDestinationNearerThanGiven(int maxKm) {
        for (Destination d : destinationLIst) {
            if (d.getKmfFromHome() < maxKm) {
                return Optional.of(d);
            }
        }
        return Optional.empty();
    }
}
