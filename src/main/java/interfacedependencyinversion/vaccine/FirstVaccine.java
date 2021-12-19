package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine {

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        checkTheList(registrated);
        List<Person> listToWorkOn = new ArrayList<>(registrated);

        vaccinationList.addAll(findPregnant(listToWorkOn));
        listToWorkOn.removeAll(findPregnant(listToWorkOn));
        vaccinationList.addAll(findOldPeople(listToWorkOn));
        listToWorkOn.removeAll((findOldPeople(listToWorkOn)));
        vaccinationList.addAll(listToWorkOn);
    }

    private List<Person> findPregnant(List<Person> registrated) {
        List<Person> result = new ArrayList<>();
        for (Person p : registrated) {
            if (p.getPegnant().equals(Pregnancy.YES)) {
                result.add(p);
            }
        }
        return result;
    }

    private List<Person> findOldPeople(List<Person> registrated) { //>65
        List<Person> result = new ArrayList<>();
        for (Person p : registrated) {
            if (p.getAge() > 65) {
                result.add(p);
            }
        }
        return result;
    }

}
