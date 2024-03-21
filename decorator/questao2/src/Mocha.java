
public class Mocha extends CondimentDecorator {
    Bevarage bevarage;

    public Mocha(Bevarage bevarage) {
        this.bevarage = bevarage;
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        double cost = bevarage.cost();
        switch (getSize()) {
            case P:
                cost += .15;
                break;
            case M:
                cost += .20;
                break;
            case G:
                cost += .25;
                break;
        }
        return cost;
    }
}
