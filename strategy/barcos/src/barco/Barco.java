package barco;

import Move.MoveBehavior;

public class Barco {
    MoveBehavior movimentacao;
    String name;

    public void performMove() {
        movimentacao.move();
    }

    public void setMovimentacao(MoveBehavior movimentacao) {
        this.movimentacao = movimentacao;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
