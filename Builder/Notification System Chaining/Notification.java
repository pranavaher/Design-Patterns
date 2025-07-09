public class Notification {
  String title;
  String body;
  String recipient;
  String channel;
  String priority;

  public void display() {
      System.out.println("\n--- Notification ---");
      System.out.println("To       : " + recipient);
      System.out.println("Channel  : " + channel);
      System.out.println("Priority : " + priority);
      System.out.println("Title    : " + title);
      System.out.println("Message  : " + body);
  }
}
