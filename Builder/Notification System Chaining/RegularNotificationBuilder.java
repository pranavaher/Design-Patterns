public class RegularNotificationBuilder extends NotificationBuilder {

  public NotificationBuilder buildTitle() {
    notification.title = "Welcome!";
    return this;
  }

  public NotificationBuilder buildBody() {
    notification.body = "Thank you for signing up.";
    return this;
  }

  public NotificationBuilder buildRecipient() {
    notification.recipient = "user@example.com";
    return this;
  }

  public NotificationBuilder buildChannel() {
    notification.channel = "EMAIL";
    return this;
  }

  public NotificationBuilder buildPriority() {
    notification.priority = "NORMAL";
    return this;
  }
}
