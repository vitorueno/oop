public class TesteMaquina {
    public static void main(String[] args) {
        MaquinaBolinhas maquinaBolinhas = new MaquinaBolinhas(10);

        maquinaBolinhas.inserirMoeda();
        maquinaBolinhas.virarManivela();
        maquinaBolinhas.entregar();

        maquinaBolinhas.inserirMoeda();
        maquinaBolinhas.virarManivela();
        maquinaBolinhas.entregar();

        maquinaBolinhas.inserirMoeda();
        maquinaBolinhas.virarManivela();
        maquinaBolinhas.entregar();

    }
}