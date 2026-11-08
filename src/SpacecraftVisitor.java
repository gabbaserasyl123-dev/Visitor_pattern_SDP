
public interface SpacecraftVisitor {

    void visitFighterShip(FighterShip ship);

    void visitCargoShip(CargoShip ship);

    void visitExplorationShip(ExplorationShip ship);
}
