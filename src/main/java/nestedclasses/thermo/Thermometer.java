package nestedclasses.thermo;

public class Thermometer {
    private int temperature;
    private String roomsName;

    private ThermometerObserver watcher;

    public Thermometer(String roomsName, int temperature) {
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
        onTemperatureChanged();
    }

    public String getRoomsName() {
        return roomsName;
    }

    public void setWatcher(ThermometerObserver watcher) {
        this.watcher = watcher;
        onTemperatureChanged();
    }

    public ThermometerObserver getWatcher() {
        return watcher;
    }
}

