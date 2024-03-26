public class Usuario implements Observer {
    private String nome;
    private Subject subject;
    private Notificador notificador;

    Usuario(String nome, Notificador notificador, Subject subject) {
        this.nome = nome;
        this.subject = subject;
        this.notificador = notificador;
        this.subject.registerObserver(this);
    }

    String getNome() {
        return nome;
    }

    @Override
    public void update(Produto produto) {
        this.notificador.enviarNotificacaoProdutoAdicionado(this, produto);
    }

    @Override
    public void update(Produto produto, double precoAntigo) {
        this.notificador.enviarNotificacaoPrecoAlterado(this, produto);
    }
}
