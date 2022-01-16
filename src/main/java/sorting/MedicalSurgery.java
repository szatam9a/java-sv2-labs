package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedicalSurgery {
    private List<Patient> patientListOfToday;

    public MedicalSurgery(List<Patient> patientListOfToday) {
        this.patientListOfToday = patientListOfToday;
    }

    public List<Patient> getPatientsInTimeOrder() {
        List<Patient> result = new ArrayList<>(patientListOfToday);
        List<Patient> result2 = new ArrayList<>(List.copyOf(patientListOfToday));
        Collections.sort(result, new PatientComparator());
        return result;
    }
}
