public class Produto {
    private String nome;
    private double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    String getNome() {
        return nome;
    }

    double getPreco() {
        return preco;
    }

    void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object objeto) {
        if (!(objeto instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) objeto;
        return this.nome.equals(other.nome);
    }
}
