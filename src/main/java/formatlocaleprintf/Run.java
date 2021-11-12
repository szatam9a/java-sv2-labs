package formatlocaleprintf;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Run {
    private List<Double> runInKM;
    private String name;

    public Run( String name) {
        runInKM = new ArrayList<>();
        this.name = name;
    }
    public void addRun(double km){
        runInKM.add(km);
    }
    public String printFormattedRunText(){
        String greetings = "Kedves %s! A mai dátum: %s. Ezen a héten ez a(z) %d. futásod. Most %.1f km-t futottál. Csak így tovább!";
        LocalDate date= LocalDate.now();
        double lastRun = runInKM.get(runInKM.size()-1);
        return String.format(greetings,name,date , runInKM.size(),lastRun);
    }
    public static void main(String[] args) {
        Run run = new Run("Kiss Béla");
        run.addRun(13.40);
        System.out.println(run.printFormattedRunText());
        run.addRun(9.30);
        System.out.println(run.printFormattedRunText());
        run.addRun(10.60);
        System.out.println(run.printFormattedRunText());
        run.addRun(12.80);
        System.out.println(run.printFormattedRunText());
    }
}
