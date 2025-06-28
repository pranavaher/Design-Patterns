class RegularNotificationFactory implements INotificationFactory {

  public EmailNotification createEmailNotification() {
    return new RegularEmailNotification();
  }

  public PushNotification createPushNotification() {
    return new RegularPushNotification();
  }

  public SmsNotification createSmsNotification() {
    return new RegularSmsNotification();
  }
}
