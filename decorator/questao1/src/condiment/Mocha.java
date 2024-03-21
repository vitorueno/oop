package condiment;

import decorator.Bevarage;
import decorator.CondimentDecorator;

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
        return .20 + bevarage.cost();
    }
}
