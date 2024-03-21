
public class Milk extends CondimentDecorator {
    Bevarage bevarage;

    public Milk(Bevarage bevarage) {
        this.bevarage = bevarage;
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription() + ", Steamed Milk";
    }

    @Override
    public double cost() {
        double cost = bevarage.cost();
        switch (getSize()) {
            case P:
                cost += 0.5;
                break;
            case M:
                cost += 0.10;
                break;
            case G:
                cost += 0.15;
                break;
        }
        return cost;
    }
}
