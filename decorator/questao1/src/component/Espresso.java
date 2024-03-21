package component;

import decorator.Bevarage;

public class Espresso extends Bevarage {
    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
