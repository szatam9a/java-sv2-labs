package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators operators = new Operators();
        System.out.println(operators.getResultOfDivision(10,6));
        System.out.println(operators.isEmpty("null"));
        System.out.println(operators.isEmpty(null));
        System.out.println(operators.isNull(null));
        System.out.println(operators.isEven(2));
    }
}
