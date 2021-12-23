package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods {
    private int cargoWeight;
    final private int maxCargo;

    public CanCarryGoodsBehaviour(int maxCargo) {
        this.maxCargo = maxCargo;
    }

    /**
     * load and return with the remaining value
     */
    @Override
    public int loadCargo(int cargoWeight) {
        if (this.cargoWeight + cargoWeight > maxCargo) {
            cargoWeight = (this.cargoWeight + cargoWeight - maxCargo);
            this.cargoWeight = maxCargo;
            return cargoWeight;

        } else {
            this.cargoWeight += cargoWeight;
            return 0;
        }
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }
}
