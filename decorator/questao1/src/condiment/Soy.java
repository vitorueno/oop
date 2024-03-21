package condiment;

import decorator.Bevarage;
import decorator.CondimentDecorator;

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
        return .15 + bevarage.cost();
    }
}
