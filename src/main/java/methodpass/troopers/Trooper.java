package methodpass.troopers;

public class Trooper {
    private String name;
    private Position position;

    public Trooper(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name must be not null");
        }
        this.name = name;
    }

    public Trooper() {
        Position position = new Position(0,0);
    }
    public void changePosition(Position target){
        if (target == null) {
            throw new IllegalArgumentException("Position must be not null");
        }
        this.position= target;
    }
    public double distanceFrom(Position target){
        if (target== null){
            throw new IllegalArgumentException("Position must be not null");
        }
        return position.distanceFrom(target);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }
}
