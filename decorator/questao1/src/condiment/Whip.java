package condiment;

import decorator.Bevarage;
import decorator.CondimentDecorator;

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
        return .10 + bevarage.cost();
    }
}
