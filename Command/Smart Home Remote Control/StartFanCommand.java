// Concrete Command

public class StartFanCommand implements ICommand {
  private Fan fan;

  public StartFanCommand(Fan fan) {
    this.fan = fan;
  }

  @Override
  public void execute() {
    fan.start();
  }

  @Override
  public void undo() {
    fan.stop();
  }
}