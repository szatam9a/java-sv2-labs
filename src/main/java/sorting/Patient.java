package sorting;

import java.time.LocalDateTime;

public class Patient {
    private String name;
    private String tajNumber;
    private LocalDateTime reservedTime;

    public Patient(String name, String tajNumber, LocalDateTime reservedTime) {
        this.name = name;
        this.tajNumber = tajNumber;
        this.reservedTime = reservedTime;
    }

    public String getName() {
        return name;
    }

    public String getTajNumber() {
        return tajNumber;
    }

    public LocalDateTime getReservedTime() {
        return reservedTime;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "reservedTime=" + reservedTime +
                '}';
    }
}
