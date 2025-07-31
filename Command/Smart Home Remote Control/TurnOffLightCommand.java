// Concrete Command

public class TurnOffLightCommand implements ICommand {
  private Light light;

  public TurnOffLightCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.off();
  }

  @Override
  public void undo() {
    light.on();
  }
}
