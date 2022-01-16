package nestedclasses.thermo;

public class ThermoMeter {
    private int temperature;
    private String roomsName;

    private ThermometerObserver watcher;

    public ThermoMeter(String roomsName, int temperature) {
        this.roomsName = roomsName;
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void onTemperatureChanged() {
        if (watcher != null) {
            watcher.handleTemperatureChange(temperature, roomsName);
        }
    }


    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getRoomsName() {
        return roomsName;
    }

    public ThermometerObserver getWatcher() {
        return watcher;
    }
}

