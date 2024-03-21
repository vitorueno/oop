
public class DarkRoast extends Bevarage {
    public DarkRoast() {
        setDescription("Darkroast");
    }

    @Override
    public double cost() {
        return 1.99 * getNumberOfShots();
    }
}
