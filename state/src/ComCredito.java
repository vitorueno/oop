import java.util.Random;

public class ComCredito implements State {
    MaquinaBolinhas maquina;
    Random vencedorAleatorio = new Random(System.currentTimeMillis());

    public ComCredito(MaquinaBolinhas maquina) {
        this.maquina = maquina;
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Moeda devolvida");
        maquina.setEstado(maquina.getSemCredito());
    }

    @Override
    public void entregar() {
        System.out.println("É preciso girar a manivela para receber a bolinha. Nenhuma bolinha entregue!");
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Não é possível inserir outra moeda. Slot já ocupado");
    }

    @Override
    public void virarManivela() {
        int vencedor = vencedorAleatorio.nextInt(10);
        if (vencedor == 0 && maquina.getNumeroBolinhas() > 1) {
            maquina.setEstado(maquina.getVencedor());
        } else {
            maquina.setEstado(maquina.getVendido());
        }
    }

}