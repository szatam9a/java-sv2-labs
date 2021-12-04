package abstractclass.exercise;

public class MathLesson {
    public static void main(String[] args) {
        MathExercise matadd = new Adder();
        MathExercise matd = new Divisor();
        MathExercise mats = new Subtracter();
        MathExercise matm = new Multiplier();
        System.out.println(matadd.getSolution(1,1));
        System.out.println(matm.getSolution(2,2));
        System.out.println(mats.getSolution(3,2));
        System.out.println(matd.getSolution(10,4));
    }
}
