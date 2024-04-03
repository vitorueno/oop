public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light luz1 = new Light();
        Light luz2 = new Light();
        CeilingFan ventilador = new CeilingFan();
        GarageDoor portaoGaragem = new GarageDoor();
        Stereo som = new Stereo();

        LightOnCommand ligarLuz1 = new LightOnCommand(luz1);
        LightOffCommand desligarLuz1 = new LightOffCommand(luz1);
        LightOnCommand ligarLuz2 = new LightOnCommand(luz2);
        LightOffCommand desligarLuz2 = new LightOffCommand(luz2);
        CeilingFanHighCommand ligarVentilador = new CeilingFanHighCommand(ventilador);
        CeilingFanOffCommand desligarVentilador = new CeilingFanOffCommand(ventilador);
        GarageUpCommand abrirPortao = new GarageUpCommand(portaoGaragem);
        GarageDownCommand fecharPortao = new GarageDownCommand(portaoGaragem);
        StereoOnWithCDCommand ligarSomComCd = new StereoOnWithCDCommand(som);
        StereoOffCommand desligarSom = new StereoOffCommand(som);

        remoteControl.setCommand(0, ligarLuz1, desligarLuz1);
        remoteControl.setCommand(1, ligarLuz2, desligarLuz2);
        remoteControl.setCommand(2, ligarVentilador, desligarVentilador);
        remoteControl.setCommand(3, abrirPortao, fecharPortao);
        remoteControl.setCommand(4, ligarSomComCd, desligarSom);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(1);
        remoteControl.undoButtonWasPressed();
        remoteControl.onButtonWasPressed(4);
        remoteControl.undoButtonWasPressed();
        remoteControl.onButtonWasPressed(3);

    }
}
