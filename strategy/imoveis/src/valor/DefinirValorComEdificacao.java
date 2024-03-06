package valor;

import java.util.HashMap;

public class DefinirValorComEdificacao implements DefinirValorComportamento {

    private final HashMap<Character, Float> valorMetroQuadradoPorRegiao = new HashMap<Character, Float>();

    private float valorPorComodos = 1000.0f;

    private int comodos;

    private float espaco;

    private char localizacao;

    public DefinirValorComEdificacao(char localizacao, float espaco, int comodos) {
        this.definirValoresMetroQuadrado();
        this.comodos = comodos;
        this.espaco = espaco;
        this.localizacao = localizacao;
    }

    @Override
    public float definirValor(){
        return this.valorMetroQuadradoPorRegiao.get(this.localizacao) * this.espaco +
                this.valorPorComodos * this.comodos;
    }

    private void definirValoresMetroQuadrado() {
        this.valorMetroQuadradoPorRegiao.put('A', 3000.0f);
        this.valorMetroQuadradoPorRegiao.put('B', 1000.0f);
        this.valorMetroQuadradoPorRegiao.put('C', 500.0f);
    }

}
