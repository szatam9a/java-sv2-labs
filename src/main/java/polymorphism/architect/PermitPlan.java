package polymorphism.architect;

public class PermitPlan extends SketchPlan implements Header{
    public PermitPlan(int pagesOfDocumentation, String title, String nameOfClient, String addressOfBuilding) {
        super(pagesOfDocumentation, title);
        this.nameOfClient = nameOfClient;
        this.addressOfBuilding = addressOfBuilding;
    }

    @Override
    public String toString() {
        return "PermitPlan{" +
                "nameOfClient='" + nameOfClient + '\'' +
                ", addressOfBuilding='" + addressOfBuilding + '\'' +
                ", pagesOfDocumentation=" + pagesOfDocumentation +
                ", title='" + title + '\'' +
                '}';
    }

    protected String nameOfClient;
    protected String addressOfBuilding;

    @Override
    public String getNameOfClient() {
        return nameOfClient;
    }

    @Override
    public String getAddressOfBuilding() {
        return addressOfBuilding;
    }
    String getHeader(){
        return title+ " "+nameOfClient+ " "+addressOfBuilding;
    }
}
