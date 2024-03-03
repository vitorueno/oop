package barco;

import Move.Vela;

public class Veleiro extends Barco {
    public Veleiro() {
        setMovimentacao(new Vela());
        setName("Veleiro");
    }
}
