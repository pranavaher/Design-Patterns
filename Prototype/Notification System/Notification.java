public class Notification {
  private String title;
  private String body;
  private String recipient;
  private String channel;
  private String priority;

  private Notification(String title, String body, String recipient, String channel, String priority) {
    this.title = title;
    this.body = body;
    this.recipient = recipient;
    this.channel = channel;
    this.priority = priority;
  }

  public Notification(String title, String body, String recipient) {
    this(title, body, recipient, "EMAIL", "NORMAL");
  }

  public Notification clone() {
    return new Notification(title, body, recipient);
  }

  public void setTitle(String title) { this.title = title; }
  public void setBody(String body) { this.body = body; }
  public void setRecipient(String recipient) { this.recipient = recipient; }

  public void display() {
    System.out.println("\n--- Notification ---");
    System.out.println("To       : " + recipient);
    System.out.println("Channel  : " + channel);
    System.out.println("Priority : " + priority);
    System.out.println("Title    : " + title);
    System.out.println("Message  : " + body);
  }
}
