package enumtype.position;

public enum Position {
    CEO(100, "nothing"), CFO(5,"house"),COO(1000,"car");
    private int salary;
    private String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }

    @Override
    public String toString() {
        return "Position{" +
                "the money=" + salary +
                ", extras='" + benefit + '\'' +
                '}';
    }
}
