public class Esgotado implements State {
    MaquinaBolinhas maquina;

    public Esgotado(MaquinaBolinhas maquina) {
        this.maquina = maquina;
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Você não inseriu uma moeda");
    }

    @Override
    public void entregar() {
        System.out.println("Não há estoque de bolinhas. Nenhuma bolinha entregue!");
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Não é possível inserir uma moeda. A máquina está vazia");
    }

    @Override
    public void virarManivela() {
        System.out.println("A máquina está vazia");
    }

}