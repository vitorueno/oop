import barco.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Barco> barcos = new ArrayList<Barco>();

        barcos.add(new Bateira());
        barcos.add(new Iate());
        barcos.add(new Canoa());
        barcos.add(new Jangada());
        barcos.add(new Veleiro());

        for(Barco barco: barcos) {
            System.out.println("Movimentação do(a) " + barco.getName());
            barco.performMove();
            System.out.println();
        }
    }
}