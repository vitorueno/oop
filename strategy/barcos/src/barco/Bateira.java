package barco;

import Move.Motor;

public class Bateira extends Barco {
    public Bateira() {
        setMovimentacao(new Motor());
        setName("Beteira");
    }
}
