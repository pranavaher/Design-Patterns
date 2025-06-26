public class EmailNotificationFactory extends NotificationFactory {
  public INotification createNotification() {
    return new EmailNotification();
  }
}
