package introinheritance.fruit;

public class Grape extends Fruit {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString()+"type:"+ type;
    }
}
