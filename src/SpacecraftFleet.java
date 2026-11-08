import java.util.ArrayList;

public class SpacecraftFleet {

    private ArrayList<Spacecraft> spacecrafts = new ArrayList<>();

    public void addSpacecraft(Spacecraft spacecraft) {
        spacecrafts.add(spacecraft);
    }

    public void performOperation(SpacecraftVisitor visitor) {
        for (Spacecraft spacecraft : spacecrafts) {
            spacecraft.accept(visitor);
        }
    }
}
