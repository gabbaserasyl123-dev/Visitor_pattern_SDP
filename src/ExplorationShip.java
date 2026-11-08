public class ExplorationShip implements Spacecraft {

    private int range;
    private int fuel;

    public ExplorationShip(int range, int fuel) {
        this.range = range;
        this.fuel = fuel;
    }

    public int getRange() {
        return range;
    }

    public int getFuel() {
        return fuel;
    }

    @Override
    public void accept(SpacecraftVisitor visitor) {
        visitor.visitExplorationShip(this);
    }
}
