package condiment;

import decorator.Bevarage;
import decorator.CondimentDecorator;

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
        return .10 + bevarage.cost();
    }
}
