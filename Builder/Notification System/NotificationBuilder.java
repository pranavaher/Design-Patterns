public abstract class NotificationBuilder {
  protected NotificationMessage notification = new NotificationMessage();

  protected String title;
  protected String body;
  protected String recipient;

  public NotificationBuilder setTitle(String title) {
    this.title = title;
    return this;
  }
  public NotificationBuilder setBody(String body) {
    this.body = body;
    return this;
  }
  public NotificationBuilder setRecipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

  public void applyUserInput() {
    notification.setTitle(title);
    notification.setBody(body);
    notification.setRecipient(recipient);
  }

  public abstract void setChannel();
  public abstract void setPriority();

  public NotificationMessage getNotification() {
    return notification;
  }
}
