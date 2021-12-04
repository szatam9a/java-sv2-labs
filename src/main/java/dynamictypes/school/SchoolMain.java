package dynamictypes.school;

public class SchoolMain {
    public static void main(String[] args) {
        School primarySchool = new PrimarySchool("Szentfazek", 1990);
        School secondarySchool = new SecondarySchool("Szentfaék", 1990);
        School school = new School("SzentFeriék", 1990);
        System.out.println(school);
        System.out.println(secondarySchool);
        System.out.println(primarySchool);
    }
}
