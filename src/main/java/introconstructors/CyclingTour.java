package introconstructors;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class CyclingTour {
    String description;
    LocalDate startTime;
    int numberOfPeople;
    double kms;

    public void registerPerson(int person){
        numberOfPeople += person;
    }
    public void ride(double km){
        kms+= km;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public static void main(String[] args) {
        CyclingTour ct = new CyclingTour("Budapest", LocalDate.of(2020,10,15)) ;
        System.out.println(ct.getDescription());
        System.out.println(ct.getKms());
        System.out.println(ct.getStartTime());
        System.out.println(ct.getNumberOfPeople());
        ct.registerPerson(5);
        ct.registerPerson(6);
        ct.ride(1100);
        System.out.println();
        System.out.println(ct.getDescription());
        System.out.println(ct.getKms());
        System.out.println(ct.getStartTime());
        System.out.println(ct.getNumberOfPeople());
    }

}
