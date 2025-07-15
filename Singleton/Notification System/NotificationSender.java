public class NotificationSender {
  private static NotificationSender sender;

  private NotificationSender() {
    System.out.println("Initializing sender...");
  }

  public static NotificationSender getSender() {
    if(sender == null) {
      sender = new NotificationSender();
    }
    return sender;
  }

  public void send(Notification notification) {
    System.out.println("Sending notification...");
    notification.display();
  }

}