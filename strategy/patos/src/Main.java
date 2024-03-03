import duck.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Duck> patos = new ArrayList<Duck>();
        patos.add(new MallardDuck());
        patos.add(new RedHeadDuck());
        patos.add(new RubberDuck());
        patos.add(new DecoyDuck());

        for (Duck pato: patos) {
            pato.display();
            pato.perfomQuack();
            pato.performFly();
            System.out.println();
        }
    }
}