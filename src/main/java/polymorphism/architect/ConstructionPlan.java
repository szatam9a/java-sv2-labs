package polymorphism.architect;

public class ConstructionPlan extends PermitPlan {

    private int sheetsOfConstructionDrawings;

    public int getSheetsOfConstructionDrawings() {
        return sheetsOfConstructionDrawings;
    }

    public ConstructionPlan(int pagesOfDocumentation, String title, String nameOfClient, String addressOfBuilding, int sheetsOfConstructionDrawings) {
        super(pagesOfDocumentation, title, nameOfClient, addressOfBuilding);
        this.sheetsOfConstructionDrawings = sheetsOfConstructionDrawings;
    }

    @Override
    public String toString() {
        return "ConstructionPlan{" +
                "sheetsOfConstructionDrawings=" + sheetsOfConstructionDrawings +
                ", nameOfClient='" + nameOfClient + '\'' +
                ", addressOfBuilding='" + addressOfBuilding + '\'' +
                ", pagesOfDocumentation=" + pagesOfDocumentation +
                ", title='" + title + '\'' +
                '}';
    }
}
