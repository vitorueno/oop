
public class Notificador {
    public void enviarNotificacaoProdutoAdicionado(Usuario usuario, Produto produto) {
        System.out.print("Mensagem para " + usuario.getNome() + ": ");
        System.out.println(produto.getNome() + " adicionado(a). Preço original: R$ " + produto.getPreco());
    }

    public void enviarNotificacaoPrecoAlterado(Usuario usuario, Produto produto) {
        System.out.print("Mensagem para " + usuario.getNome() + ": ");
        System.out.println(produto.getNome() + " agora custa R$ " + produto.getPreco());
    }
}
