package component;

import decorator.Bevarage;

public class Decaf extends Bevarage {
    public Decaf() {
        setDescription("Decaf");
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
