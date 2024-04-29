public class WmaPlayAdapter implements FormatoAudio {
    WmaPlay wmaPlay;

    public WmaPlayAdapter(WmaPlay wmaPlay) {
        this.wmaPlay = wmaPlay;
    }

    @Override
    public void abrir(String arquivo) {
        wmaPlay.setFile(arquivo);
        wmaPlay.open();
    }

    @Override
    public void parar() {
        wmaPlay.stop();
        wmaPlay.setFile(null);
        wmaPlay.setLocation(-1);
    }

    @Override
    public void reproduzir() {
        wmaPlay.setLocation(0);
        wmaPlay.play();

        System.out.println("Tocando!\n");
    }

}
