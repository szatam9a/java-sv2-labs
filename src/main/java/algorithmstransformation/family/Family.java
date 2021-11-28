package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<FamilyMember> familyMemberList ;

    public Family() {
        this.familyMemberList = new ArrayList<>();
    }

    public List<Integer> searchFamilyMemberByFirstname(String firstname){
        List<Integer> result = new ArrayList<>();
        for (FamilyMember actual:familyMemberList
             ) {
            if (actual.getName().contains(firstname)){
                result.add(actual.getAge());
            }
        }
    return result;}


    public void addFamilyMember(FamilyMember familyMember){
        familyMemberList.add(familyMember);
    }

    public List<FamilyMember> getFamilyMemberList() {
        return familyMemberList;
    }
}
