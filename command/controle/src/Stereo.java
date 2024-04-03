public class Stereo {
    private int volume;
    private static final String FRASE_MIDIA = "Definido midia do altofalante como ";
    private String midia;

    public void on() {
        System.out.println("Altofalante ligado");
    }

    public void off() {
        System.out.println("Autofalante desligado");
    }

    public void setCD() {
        midia = "CD";
        System.out.println(FRASE_MIDIA + midia);
    }

    public void setDvd() {
        midia = "DVD";
        System.out.println(FRASE_MIDIA + midia);
    }

    public void setRadio() {
        midia = "rádio";
        System.out.println(FRASE_MIDIA + midia);
    }

    public void setVolume(int volume) {
        System.out.println("Definido o volume do altofalante para " + volume);
        this.volume = volume;
    }
}
