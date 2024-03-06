package imovel;

import valor.DefinirValorSemEdificacao;

public class Terreno extends Imovel {
    public Terreno(char localizacao, float espaco) {
        super(localizacao, espaco, 0);
        setValor(new DefinirValorSemEdificacao(espaco, localizacao));
    }
}
