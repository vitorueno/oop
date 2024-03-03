package duck;

import fly.FlyWithWings;
import quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("Eu sou um pato Mallard!");
    }
}
