public class Whip extends CondimentDecorator {
    Bevarage bevarage;

    public Whip(Bevarage bevarage) {
        this.bevarage = bevarage;
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription() + ", Whip";
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
