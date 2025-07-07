public class NotificationMessage {
  private String title;
  private String body;
  private String recipient;
  private String channel;
  private String priority;

  public void display() {
    System.out.println("\n--- Notification ---");
    System.out.println("To       : " + recipient);
    System.out.println("Channel  : " + channel);
    System.out.println("Priority : " + priority);
    System.out.println("Title    : " + title);
    System.out.println("Message  : " + body);
  }

  // Getters and Setters
  
  public String getTitle() { return title; }
  public void setTitle(String title) { this.title = title; }

  public String getBody() { return body; }
  public void setBody(String body) { this.body = body; }

  public String getRecipient() { return recipient; }
  public void setRecipient(String recipient) { this.recipient = recipient; }

  public String getChannel() { return channel; }
  public void setChannel(String channel) { this.channel = channel; }

  public String getPriority() { return priority; }
  public void setPriority(String priority) { this.priority = priority; }
}