public class FuelConsumptionVisitor implements SpacecraftVisitor {

    @Override
    public void visitFighterShip(FighterShip ship) {
        double fuel = ship.getSpeed() * 2.0;

        System.out.println("Fighter Ship fuel consumption: " + fuel);
    }

    @Override
    public void visitCargoShip(CargoShip ship) {
        double fuel = ship.getCurrentCargo() * 0.5;

        System.out.println("Cargo Ship fuel consumption: " + fuel);
    }

    @Override
    public void visitExplorationShip(ExplorationShip ship) {
        double fuel = ship.getRange() * 0.1;

        System.out.println("Exploration Ship fuel consumption: " + fuel);
    }
}
