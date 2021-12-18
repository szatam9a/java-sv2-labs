package abstractclass.gamecharacter;

public class Point {
    private long x;
    private long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public  long distance(Point point){
    return Math.round(Math.sqrt(Math.pow((this.x-point.x),2)+Math.pow((this.y-point.y),2)));
    }
}
