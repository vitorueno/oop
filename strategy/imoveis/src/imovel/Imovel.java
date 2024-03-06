package imovel;

import valor.DefinirValorComportamento;

public abstract  class Imovel {
    private int comodos;
    private float espaco;
    private char localizacao;

    private DefinirValorComportamento valor;

    public Imovel(char localizacao, float espaco, int comodos) {
        setLocalizacao(localizacao);
        setEspaco(espaco);
        setComodos(comodos);
    }

    public void setValor(DefinirValorComportamento valor) {
        this.valor = valor;
    }

    public float calcularValor() {
        return valor.definirValor();
    }

    public void setComodos(int comodos) {
        this.comodos = comodos;
    }

    public void setEspaco(float espaco) {
        this.espaco = espaco;
    }

    public void setLocalizacao(char localizacao) {
        this.localizacao = localizacao;
    }
}
