public class Vendido implements State {
    MaquinaBolinhas maquina;

    public Vendido(MaquinaBolinhas maquina) {
        this.maquina = maquina;
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Não é possível ejetar a moeda pois a alavanca já foi acionada");
    }

    @Override
    public void entregar() {
        maquina.liberaBolinha();
        if (maquina.getNumeroBolinhas() > 0) {
            maquina.setEstado(maquina.getSemCredito());
        } else {
            maquina.setEstado(maquina.getEsgotado());
        }
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Espere até que a máquina termine de lhe entregar a bolinha para inserir a moeda");
    }

    @Override
    public void virarManivela() {
        System.out.println("Acionar a alavanca novamente não lhe dará outra bolinha");
    }

}