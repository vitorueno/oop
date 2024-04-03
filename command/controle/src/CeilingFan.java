public class CeilingFan {
    String velocidade;
    public final String fraseLigado = "Ventilador ligado na velocidade ";

    public void highSpeed() {
        this.velocidade = "alta";
        System.out.println(this.fraseLigado + velocidade);
    }

    public void mediumSpeed() {
        this.velocidade = "média";
        System.out.println(this.fraseLigado + velocidade);
    }

    public void lowSpeed() {
        this.velocidade = "baixa";
        System.out.println(this.fraseLigado + velocidade);
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void off() {
        System.out.println("Ventilador desligado");
    }
}
