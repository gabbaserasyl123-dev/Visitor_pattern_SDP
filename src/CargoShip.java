public class CargoShip implements Spacecraft{
    private int capacity;
    private int currentCargo;

    public CargoShip(int capacity, int currentCargo) {
        this.capacity = capacity;
        this.currentCargo = currentCargo;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentCargo() {
        return currentCargo;
    }


    @Override
    public void accept(SpacecraftVisitor visitor) {
        visitor.visitCargoShip(this);
    }
}
