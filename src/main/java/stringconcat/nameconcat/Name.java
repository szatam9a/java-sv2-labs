package stringconcat.nameconcat;

public class Name  {
    private String familyName;
    private String middleName;
    private String givenName;
    public Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public Name(String familyName, String middleName, String givenName) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }

    public String concatNameWesternStyle(){
        String concatText = "" ;
        concatText = concatText.concat(title.getTitle());
        concatText = concatText.concat(" ");
        concatText = concatText.concat(givenName);
        concatText = concatText.concat(" ");
        concatText = concatText.concat(middleName);
        concatText = concatText.concat(" ");
        concatText = concatText.concat(familyName);


        return (concatText);
    }
    public String concatNameHungarianStyle(){
        return (title.getTitle()+" "+familyName+" "+middleName+" "+givenName);

    }
}
