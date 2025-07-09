public abstract class NotificationBuilder {
  protected Notification notification = new Notification();

  public abstract NotificationBuilder buildTitle();
  public abstract NotificationBuilder buildBody();
  public abstract NotificationBuilder buildRecipient();
  public abstract NotificationBuilder buildChannel();
  public abstract NotificationBuilder buildPriority();

  public Notification build() {
      return notification;
  }
}
