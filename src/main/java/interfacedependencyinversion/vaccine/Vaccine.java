package interfacedependencyinversion.vaccine;

import java.util.List;

public interface Vaccine {

    List<Person> getVaccinationList();

    void generateVaccinationList(List<Person> registrated);

    default void checkTheList(List list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException("empty list");
        }
    }

}
