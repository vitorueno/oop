package barco;

import Move.Remo;

public class Canoa extends Barco {
    public Canoa() {
        setMovimentacao(new Remo());
        setName("Canoa");
    }
}
