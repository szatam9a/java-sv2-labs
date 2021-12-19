package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot {
    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();
    public final static long ALTITUDE = 5;

    public AstroBoy(Point position) {
        this.position= position;

    }

    public void walkTo(Point position) {
        path.add(position);
        this.position = (position);
    }

    public void flyTo(Point position) {
        path.add(position);
        this.position=position;
    }

    public void liftTo(long altitude) {
        Point newPosition = new Point(position.getX(), position.getY(), altitude);
        path.add(newPosition);
        this.position = newPosition;
    }

    public void moveTo(Point position) {
        walkTo(position);
    }

    public void fastMoveTo(Point position) {

        liftTo(ALTITUDE);
        flyTo(new Point(position.getX(),position.getY(),ALTITUDE));
        liftTo(0);
    } //komplex mozgás, felemelkedik, elrepül a célpont fölé, majd leereszkedik

    public void rotate(int angle) {
        this.angle= angle;
    }

    @Override
    public List<Point> getPath() {
        return path;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }
}
