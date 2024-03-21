
public class Main {
    public static void main(String[] args) {
        Bevarage bevarage = new DarkRoast();
        bevarage.setNumberOfShots(2);
        System.out.println(bevarage.getDescription() + " $" + bevarage.cost());

        Bevarage bevarage2 = new Espresso();
        bevarage2.setSize(Bevarage.Size.G);
        bevarage2 = new Milk(bevarage2);
        bevarage2 = new Whip(bevarage2);
        System.out.println(bevarage2.getDescription() + " $" + bevarage2.cost());

        Bevarage bevarage3 = new Decaf();
        bevarage3.setSize(Bevarage.Size.P);
        bevarage3.setNumberOfShots(3);
        bevarage3 = new Mocha(bevarage3);
        bevarage3 = new Soy(bevarage3);
        System.out.println(bevarage3.getDescription() + " $" + bevarage3.cost());
    }
}
