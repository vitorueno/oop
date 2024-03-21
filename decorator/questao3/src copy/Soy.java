
public class Soy extends CondimentDecorator {
    Bevarage bevarage;

    public Soy(Bevarage bevarage) {
        this.bevarage = bevarage;
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        double cost = bevarage.cost();
        switch (getSize()) {
            case P:
                cost += .10;
                break;
            case M:
                cost += .15;
                break;
            case G:
                cost += .20;
                break;
        }
        return cost;
    }
}
