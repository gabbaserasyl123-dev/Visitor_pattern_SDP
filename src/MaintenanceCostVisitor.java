public class MaintenanceCostVisitor implements SpacecraftVisitor {
    @Override
    public void visitFighterShip(FighterShip ship) {
        int cost = ship.getArmor() * 10;
        System.out.println("Fighter Ship maintenance cost: " + cost);
    }

    @Override
    public void visitCargoShip(CargoShip ship) {
        int cost = ship.getCurrentCargo() * 5;
        System.out.println("Cargo Ship maintenance cost: " + cost);
    }

    @Override
    public void visitExplorationShip(ExplorationShip ship) {
        int cost = ship.getRange() * 7;
        System.out.println("Exploration Ship maintenance cost: " + cost);
    }
}
