
public class  SafetyInspectionVisitor implements SpacecraftVisitor {

    @Override
    public void visitFighterShip(FighterShip ship) {

        if (ship.getArmor() >= 50) {
            System.out.println("Fighter Ship: PASSED");
        } else {
            System.out.println("Fighter Ship: FAILED");
        }
    }

    @Override
    public void visitCargoShip(CargoShip ship) {

        if (ship.getCurrentCargo() <= ship.getCapacity()) {
            System.out.println("Cargo Ship: PASSED");
        } else {
            System.out.println("Cargo Ship: FAILED");
        }
    }

    @Override
    public void visitExplorationShip(ExplorationShip ship) {

        if (ship.getFuel() >= 30) {
            System.out.println("Exploration Ship: PASSED");
        } else {
            System.out.println("Exploration Ship: FAILED");
        }
    }
}

