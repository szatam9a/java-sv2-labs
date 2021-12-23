package polymorphism.architect;

public class Architect {
    public static void main(String[] args) {
        Plan sketchPlan = new SketchPlan(1, "titkesketch");
        sketchPlan.getPagesOfDocumentation();
        System.out.println(sketchPlan);
        Plan permitPlan = new PermitPlan(1, "1", "1", "1");
        permitPlan.getPagesOfDocumentation();
        System.out.println(permitPlan);
        Plan constructionPlan = new ConstructionPlan(1, "title", "1", "1", 1);
        constructionPlan.getPagesOfDocumentation();
        System.out.println(constructionPlan);
        SketchPlan plan4 = new SketchPlan(1, "titleke skepchan");
        plan4.getTitle();
        plan4.getPagesOfDocumentation();
        System.out.println(plan4);
        SketchPlan plan5 = new PermitPlan(1, "1", "1", "1");
        plan5.getPagesOfDocumentation();
        plan5.getTitle();
        System.out.println(plan5);
        SketchPlan plan6 = new ConstructionPlan(1, "title1", "1", "1", 1);
        plan6.getTitle();
        plan6.getPagesOfDocumentation();
        System.out.println(plan6);
        Header header = new PermitPlan(1, "1", "1", "1");
        header.getAddressOfBuilding();
        header.getNameOfClient();
        System.out.println(header);
        Header header2 = new ConstructionPlan(1, "title", "1", "1", 1);
        header2.getAddressOfBuilding();
        header2.getNameOfClient();
        System.out.println(header2);
        PermitPlan plan7 = new PermitPlan(1, "1", "1", "1");
        plan7.getAddressOfBuilding();
        plan7.getNameOfClient();
        plan7.getTitle();
        plan7.getHeader();
        plan7.getPagesOfDocumentation();
        System.out.println(plan7);
        PermitPlan plan8 = new ConstructionPlan(1, "title", "1", "1", 1);
        plan8.getAddressOfBuilding();
        plan8.getNameOfClient();
        plan8.getTitle();
        plan8.getHeader();
        plan8.getPagesOfDocumentation();
        System.out.println(plan8);
        ConstructionPlan plan9 = new ConstructionPlan(1, "title", "1", "1", 1);
        plan9.getAddressOfBuilding();
        plan9.getNameOfClient();
        plan9.getTitle();
        plan9.getHeader();
        plan9.getSheetsOfConstructionDrawings();
        System.out.println(plan9);
    }
}
