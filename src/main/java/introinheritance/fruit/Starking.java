package introinheritance.fruit;

public class Starking extends Apple{
    Colour colour = Colour.RED;

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public String toString() {
        return super.toString()+"color:"+ colour;
    }
}
