public class Main {
    public static void main(String[] args) {
        Notificador notificador = new Notificador();
        Loja loja = new Loja(notificador);
        Usuario usuario1 = new Usuario("Vitor", notificador, loja);

        Produto produto = new Produto("guitarra", 800);

        loja.adicionarProduto(produto);

        Usuario usuario2 = new Usuario("Slash", notificador, loja);

        loja.alterarPreco(produto, 1000);
    }
}
