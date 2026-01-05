public class Main {
  public static void main(String[] args) {
    HumanRobot humanRobot = new HumanRobot(new NoWalk(), new Talk(), new Fly());
    humanRobot.fly();
    humanRobot.walk();
    humanRobot.talk();
  }
}