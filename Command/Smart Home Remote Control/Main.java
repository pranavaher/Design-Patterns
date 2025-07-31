public class Main {
  public static void main(String[] args) {
    // Receivers
    Light light = new Light();
    Fan fan = new Fan();

    // Commands
    ICommand lightOn = new TurnOnLightCommand(light);
    ICommand lightOff = new TurnOffLightCommand(light);

    ICommand fanStart = new StartFanCommand(fan);
    ICommand fanStop = new StopFanCommand(fan);

    // Invoker
    RemoteControl remote = new RemoteControl();

    // Testing
    remote.setCommand(lightOn);
    remote.pressButton();
    remote.pressUndo();

    remote.setCommand(fanStart);
    remote.pressButton();
    remote.pressUndo();
    
    remote.setCommand(fanStop);
    remote.pressButton();
    remote.pressUndo();

    remote.setCommand(lightOff);
    remote.pressButton();
    remote.pressUndo();
  }
}
