package imovel;

import valor.DefinirValorComEdificacao;

public class Casa extends Imovel {
    public Casa(char localizacao, float espaco, int comodos) {
        super(localizacao, espaco, comodos);
        setValor(new DefinirValorComEdificacao(localizacao, espaco, comodos));
    }
}
