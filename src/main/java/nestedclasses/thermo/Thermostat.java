package nestedclasses.thermo;

import java.util.ArrayList;
import java.util.List;

public class Thermostat {
    private List<Thermometer> meters;
    private List<String> roomsToHeat;
    private int temperatureLimit; //min

    public Thermostat() {
        this.meters = new ArrayList<>();
        this.roomsToHeat = new ArrayList<>();
        this.temperatureLimit = 23;
    }


    public void addThermometer(Thermometer thermometer) {
        meters.add(thermometer);
        thermometer.setWatcher(new ThermometerObserver() {
            @Override
            public void handleTemperatureChange(int temp, String room) {
                if (temp < temperatureLimit) {
                    roomsToHeat.add(room);
                } else {
                    roomsToHeat.remove(room);
                }
            }
        });
    }

    public List<String> getRoomsToHeat() {
        return this.roomsToHeat;
    }
}
