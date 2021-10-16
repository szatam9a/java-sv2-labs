package localvariables;

public class Distance {
    private double distanceinkm;
    private boolean accurate;

    public Distance(double distance, boolean accurate) {
        this.distanceinkm = distance;
        this.accurate = accurate;
    }
    public double getDistanceinkm() {
        return distanceinkm;
    }

    public boolean isAccurate() {
        return accurate;
    }
}
