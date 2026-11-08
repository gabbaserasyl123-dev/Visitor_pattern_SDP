public class Main{
    public static void main(String[] args) {

        FighterShip fighter = new FighterShip(80, 100);
        CargoShip cargo = new CargoShip(500, 200);
        ExplorationShip explorer = new ExplorationShip(1000, 80);

        SpacecraftFleet fleet = new SpacecraftFleet();

        fleet.addSpacecraft(fighter);
        fleet.addSpacecraft(cargo);
        fleet.addSpacecraft(explorer);

        MaintenanceCostVisitor maintenance = new MaintenanceCostVisitor();
        SafetyInspectionVisitor inspection = new SafetyInspectionVisitor();
        FuelConsumptionVisitor fuel = new FuelConsumptionVisitor();

        System.out.println("Maintenance Report:");
        fleet.performOperation(maintenance);

        System.out.println("\nSafety Inspection Report:");
        fleet.performOperation(inspection);

        System.out.println("\nFuel Consumption Report");
        fleet.performOperation(fuel);
    }
}