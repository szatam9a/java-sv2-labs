package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine {
    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        checkTheList(registrated);
        vaccinationList.addAll(findYoungPeople(registrated));
    }

    private List<Person> findYoungPeople(List<Person> registrated) { //<65
        List<Person> result = new ArrayList<>();
        for (Person p : registrated) {
            if ((p.getAge() < 65) && p.getPegnant().equals(Pregnancy.NO) && p.getChronic().equals(ChronicDisease.NO)) {
                result.add(p);
            }
        }
        return result;
    }

}
