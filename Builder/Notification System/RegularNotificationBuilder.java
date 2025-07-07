public class RegularNotificationBuilder extends NotificationBuilder {
  public void setChannel() {
    notification.setChannel(Channel.EMAIL.name());
  }

  public void setPriority() {
    notification.setPriority(Priority.NORMAL.name());
  }
}
