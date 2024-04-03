public class RemoteControl {
    private Command onCommands[];
    private Command offCommands[];
    private Command undoCommand;

    public final int SIZE = 7;

    public RemoteControl() {
        onCommands = new Command[SIZE];
        offCommands = new Command[SIZE];

        Command noCommand = new NoCommand();

        for (int i = 0; i < SIZE; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPressed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        String retorno = "------ Remote Control ------\n";
        for (int i = 0; i < SIZE; i++) {
            retorno += "[Slot " + i + "] " + onCommands[i].getClass() + "\t\t\t" + offCommands[i].getClass() + "\n";
        }

        return retorno;
    }
}
