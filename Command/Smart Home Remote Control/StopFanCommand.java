// Concrete Command

public class StopFanCommand implements ICommand {
  private Fan fan;

  public StopFanCommand(Fan fan) {
    this.fan = fan;
  }

  @Override
  public void execute() {
    fan.stop();
  }
  
  @Override
  public void undo() {
    fan.start();
  }
}
