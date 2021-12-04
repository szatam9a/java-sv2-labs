package introinheritance.fruit;

public class GoldenDelicious extends Apple{
    Colour colour = Colour.YELLOW;

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
