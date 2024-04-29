
public class WmaPlay {
    private String file = null;
    private int location = -1;
    private boolean playing = false;

    public void setFile(String file) {
        this.file = file;
        System.out.println("Arquivo definido: " + file);
    }

    public void setLocation(int location) {
        this.location = location;
        System.out.println("Posição definida para: " + location);
    }

    public void open() {
        if (file != null) {
            System.out.println("Abrindo o arquivo definido (" + file + ")");
        } else {
            System.out.println("Falha ao abrir: nenhum arquivo foi especificado");
        }
    }

    public void play() {
        if (this.file != null && this.location != -1) {
            System.out.println("Reproduzindo o arquivo (" + file + ")");
            playing = true;
        } else {
            System.out.println("Impossível reproduzir: o arquivo ou a posição não foram específicados");
        }
    }

    public void stop() {
        if (playing && file != null && location != -1) {
            playing = false;
            System.out.println("Reprodução do arquivo " + file + " parado.");
        } else {
            System.out.println("Não há nenhuma reprodução tocando");
        }
    }

}