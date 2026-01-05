public abstract class Robot {
  private Walkable walkableBehaviour;
  private Talkable talkableBehaviour;
  private Flyable flyableBehaviour;

  public Robot(Walkable w, Talkable t, Flyable f) {
    this.walkableBehaviour = w;
    this.talkableBehaviour = t;
    this.flyableBehaviour = f;
  }

  public void walk() {
    walkableBehaviour.walk();
  }

  public void talk() {
    talkableBehaviour.talk();
  }

  public void fly() {
    flyableBehaviour.fly();
  }
}
