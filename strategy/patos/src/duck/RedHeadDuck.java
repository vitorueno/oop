package duck;

import fly.FlyWithWings;
import quack.Quack;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("Eu sou um pato de Cabeça Vermelha");
    }
}
