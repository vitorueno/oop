package valor;

import java.util.HashMap;

public class DefinirValorSemEdificacao implements DefinirValorComportamento {
    private final HashMap<Character, Float> valorMetroQuadradoPorRegiao = new HashMap<Character, Float>();

    private final float espaco;
    private final char localizacao;

    public DefinirValorSemEdificacao(float espaco, char localizacao) {
        this.definirValoresMetroQuadrado();
        this.espaco = espaco;
        this.localizacao = localizacao;
    }

    @Override
    public float definirValor() {
        return valorMetroQuadradoPorRegiao.get(this.localizacao) * this.espaco;
    }

    private void definirValoresMetroQuadrado() {
        this.valorMetroQuadradoPorRegiao.put('A', 1500.0f);
        this.valorMetroQuadradoPorRegiao.put('B', 750.0f);
        this.valorMetroQuadradoPorRegiao.put('C', 200.0f);
    }
}
