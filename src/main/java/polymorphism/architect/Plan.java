package polymorphism.architect;

public abstract class Plan {
    protected int pagesOfDocumentation;

    @Override
    public String toString() {
        return "Plan{" +
                "pagesOfDocumentation=" + pagesOfDocumentation +
                '}';
    }

    public Plan(int pagesOfDocumentation) {
        this.pagesOfDocumentation = pagesOfDocumentation;
    }
    public abstract int getPagesOfDocumentation();

}
