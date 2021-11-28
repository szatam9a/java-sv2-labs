package algorithmstransformation.family;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    @Test
    void searchFamilyMemberByFirstnameTest() {
        Family family = new Family();
        family.addFamilyMember(new FamilyMember("jhon karcsi",3));
        family.addFamilyMember(new FamilyMember("jhon doe",3));
        family.addFamilyMember(new FamilyMember("jhon jhon",3));
        family.addFamilyMember(new FamilyMember("jhon linkoln",3));
        family.addFamilyMember(new FamilyMember("jhon kata",3));
        family.addFamilyMember(new FamilyMember("michael kata",3));


        assertEquals(5,family.searchFamilyMemberByFirstname("jhon").size());
    }
}