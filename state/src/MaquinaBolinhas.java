public class MaquinaBolinhas {
    private State semCredito;
    private State comCredito;
    private State vendido;
    private State esgotado;
    private State vencedor;

    private State estado = esgotado;
    private int numeroBolinhas = 0;

    public MaquinaBolinhas(int numeroBolinhas) {
        semCredito = new SemCredito(this);
        comCredito = new ComCredito(this);
        vendido = new Vendido(this);
        esgotado = new Esgotado(this);
        vencedor = new Vencedor(this);

        this.numeroBolinhas = numeroBolinhas;

        if (this.numeroBolinhas > 0) {
            this.estado = semCredito;
        }
    }

    public void inserirMoeda() {
        this.estado.inserirMoeda();
    }

    public void ejetarMoeda() {
        this.estado.ejetarMoeda();
    }

    public void virarManivela() {
        this.estado.virarManivela();
    }

    public void entregar() {
        this.estado.entregar();
    }

    public State getEstado() {
        return estado;
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }

    public int getNumeroBolinhas() {
        return numeroBolinhas;
    }

    public State getSemCredito() {
        return semCredito;
    }

    public State getComCredito() {
        return comCredito;
    }

    public State getVendido() {
        return vendido;
    }

    public State getEsgotado() {
        return esgotado;
    }

    public State getVencedor() {
        return vencedor;
    }

    public void liberaBolinha() {
        System.out.println("Bolinha liberada!");
        if (numeroBolinhas != 0) {
            numeroBolinhas--;
        }
    }
}
