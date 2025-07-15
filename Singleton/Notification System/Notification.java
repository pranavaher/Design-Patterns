public class Notification {
  private String title;
  private String body;
  private String recipient;
  private String channel;
  private String priority;

  public Notification(String title, String body, String recipient) {
    this.title = title;
    this.body = body;
    this.recipient = recipient;
    this.channel = "EMAIL";
    this.priority = "NORMAL";
  }

  public void display() {
    System.out.println("\n------ Notification ------");
    System.out.println("To       : " + recipient);
    System.out.println("Channel  : " + channel);
    System.out.println("Priority : " + priority);
    System.out.println("Title    : " + title);
    System.out.println("Message  : " + body);
  }
}
