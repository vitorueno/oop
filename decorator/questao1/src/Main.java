import component.*;
import condiment.*;
import decorator.*;

public class Main {
    public static void main(String[] args) {
        Bevarage bevarage = new DarkRoast();
        System.out.println(bevarage.getDescription() + " $" + bevarage.cost());

        Bevarage bevarage2 = new Espresso();
        bevarage2 = new Milk(bevarage2);
        bevarage2 = new Whip(bevarage2);
        System.out.println(bevarage2.getDescription() + " $" + bevarage2.cost());

        Bevarage bevarage3 = new Decaf();
        bevarage3 = new Mocha(bevarage3);
        bevarage3 = new Soy(bevarage3);
        System.out.println(bevarage3.getDescription() + " $" + bevarage3.cost());
    }
}
