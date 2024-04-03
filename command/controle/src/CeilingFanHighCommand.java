public class CeilingFanHighCommand implements Command {
    CeilingFan fan;

    public CeilingFanHighCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.highSpeed();
    }

    @Override
    public void undo() {
        fan.off();
    }
}
