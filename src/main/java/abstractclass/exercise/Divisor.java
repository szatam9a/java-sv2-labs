package abstractclass.exercise;

public class Divisor extends MathExercise{
    @Override
    public int getSolution(int a, int b) {
        return (int) Math.round((1.0*a)/b);
    }
}
