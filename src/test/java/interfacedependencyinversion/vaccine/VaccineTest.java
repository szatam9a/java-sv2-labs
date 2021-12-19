package interfacedependencyinversion.vaccine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VaccineTest {


    List<Person> people = new ArrayList<>();
    Vaccine vaccine;

    @BeforeEach
    void init(){


        people.add(new Person("ok", 64,ChronicDisease.NO,Pregnancy.YES));
        people.add(new Person("ok", 66,ChronicDisease.YES,Pregnancy.NO));
        people.add(new Person("ok", 70,ChronicDisease.YES,Pregnancy.NO));
        people.add(new Person("ok", 60,ChronicDisease.NO,Pregnancy.YES));
        people.add(new Person("ok", 60,ChronicDisease.NO,Pregnancy.NO));
    }
    @AfterEach
    void clean(){
        people.clear();
    }

    @Test
    void firstVaccine() {
        vaccine = new FirstVaccine();
        vaccine.generateVaccinationList(people);
        assertEquals(people.size(),vaccine.getVaccinationList().size());
    }

    @Test
    void secondVaccine() {
        vaccine = new SecondVaccine();
        vaccine.generateVaccinationList(people);
        assertEquals(1,vaccine.getVaccinationList().size());
    }


}