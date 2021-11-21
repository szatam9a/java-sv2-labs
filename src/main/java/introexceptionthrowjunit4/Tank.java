package introexceptionthrowjunit4;

public class Tank {
    private int angle;

    public void modifyAngle(int angleNumber) {
        angle += angleNumber;
        if (angle > 360) {
            angle = angle % 360;
        }
        if (angle > 160) {
            throw new IllegalArgumentException("a tank 80fokot képes fordulni jobbra és ballra is.");
        }
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }
}
