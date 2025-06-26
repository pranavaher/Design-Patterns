public class WhatsappNotificationFactory extends NotificationFactory {
  public INotification createNotification() {
    return new WhatsappNotification();
  }
}
