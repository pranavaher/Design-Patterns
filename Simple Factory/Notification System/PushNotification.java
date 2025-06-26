public class PushNotification implements INotification {
  @Override
  public void sendNotification(String message) {
    System.out.println("Sending Push Notification: " + message);
  }
}
