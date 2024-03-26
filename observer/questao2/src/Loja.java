import java.util.ArrayList;

public class Loja extends Subject {
    private Notificador notificador;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Loja(Notificador notificador) {
        this.notificador = notificador;
    }

    void adicionarProduto(Produto produto) {
        produtos.add(produto);
        notifyObservers(produto);
    }

    void alterarPreco(Produto produto, double novoPreco) {
        for (Produto p : produtos) {
            if (p.equals(produto)) {
                double precoAntigo = p.getPreco();
                p.setPreco(novoPreco);
                notifyObservers(p, precoAntigo);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void notifyObservers(Produto produto) {
        for (Observer observer : observers) {
            observer.update(produto);
        }
    }

    public void notifyObservers(Produto produto, double precoAntigo) {
        for (Observer observer : observers) {
            observer.update(produto, precoAntigo);
        }
    }
}
