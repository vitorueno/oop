public class SemCredito implements State {
    MaquinaBolinhas maquina;

    public SemCredito(MaquinaBolinhas maquina) {
        this.maquina = maquina;
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Não há moedas inseridas para ejetar");
    }

    @Override
    public void entregar() {
        System.out.println("Você acionou a alavanca sem inserir moedas");
    }

    @Override
    public void inserirMoeda() {
        maquina.setEstado(maquina.getComCredito());
    }

    @Override
    public void virarManivela() {
        System.out.println("Você acionou a alavanca sem inserir moedas");
    }

}
