package barco;

import Move.Motor;

public class Iate extends Barco {
    public Iate() {
        setMovimentacao(new Motor());
        setName("Iate");
    }
}
