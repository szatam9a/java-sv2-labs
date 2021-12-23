package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private List<Ship> ships = new ArrayList<>();
    private int waitingPeople;
    private int waitingCargo;

    void addShip(Ship ship){
        ships.add(ship);
    }

    void loadShip(int passengers, int cargoWeight) {
        int tempCargo = cargoWeight;
        int tempPassengers = passengers;

        for (Ship ship: ships) {
            if (ship instanceof CanCarryGoods && tempCargo>0){
                tempCargo= ((CanCarryGoods) ship).loadCargo(tempCargo);
            }
            if (ship instanceof CanCarryPassengers && tempPassengers>0){
                tempPassengers= ((CanCarryPassengers) ship).loadPassenger(tempPassengers);
            }
        }
        waitingCargo =tempCargo;
        waitingPeople =tempPassengers;
    }

    public int getWaitingPeople() {
        return waitingPeople;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
