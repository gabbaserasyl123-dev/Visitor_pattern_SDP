public class FighterShip implements Spacecraft{
    private int speed;
    private int armor;

    public  FighterShip(int speed, int armor) {
        this.speed = speed;
        this.armor = armor;
    }

    public int getSpeed() {
        return speed;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public void accept(SpacecraftVisitor visitor) {
        visitor.visitFighterShip(this);
    }
}
