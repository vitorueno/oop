
import java.util.concurrent.*;

public class AudioPlayer {
    public static void main(String[] args) {
        WmaPlay wmaPlay = new WmaPlay();
        WmaPlayAdapter wmaPlayAdapter = new WmaPlayAdapter(wmaPlay);

        wmaPlayAdapter.abrir("yesterday_beatles.wav");
        wmaPlayAdapter.reproduzir();

        waitFiveSecondsPrintingDots();

        wmaPlayAdapter.parar();
    }

    public static void waitFiveSecondsPrintingDots() {
        sleepSeconds(1);
        System.out.print(".");
        sleepSeconds(1);
        System.out.print(".");
        sleepSeconds(1);
        System.out.print(".");
        sleepSeconds(1);
        System.out.print(".");
        sleepSeconds(1);
        System.out.print(".\n");
    }

    public static void sleepSeconds(int seconds) {
        try {
            Thread.sleep(1000 * seconds); // Dorme por 3 segundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Re-interrompe a thread se necessário
            System.out.println("Thread interrompida enquanto dormia");
        }
    }
}
