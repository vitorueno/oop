package imovel;

import valor.DefinirValorComEdificacao;

public class Apartamento extends Imovel {
    public Apartamento(char localizacao, float espaco, int comodos) {
        super(localizacao, espaco, comodos);
        setValor(new DefinirValorComEdificacao(localizacao, espaco, comodos));
    }
}
