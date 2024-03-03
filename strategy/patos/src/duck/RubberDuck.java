package duck;

import fly.FlyNoWay;
import quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("Eu sou um pato de borracha!");
    }
}
