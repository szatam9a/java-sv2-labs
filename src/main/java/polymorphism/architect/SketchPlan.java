package polymorphism.architect;

public class SketchPlan extends Plan {
    protected String title;

    public String getTitle() {
        return title;
    }

    public SketchPlan(int pagesOfDocumentation, String title) {
        super(pagesOfDocumentation);
        this.title = title;
    }

    @Override
    public String toString() {
        return "SketchPlan{" +
                "pagesOfDocumentation=" + pagesOfDocumentation +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public int getPagesOfDocumentation() {
        return pagesOfDocumentation;
    }
}
