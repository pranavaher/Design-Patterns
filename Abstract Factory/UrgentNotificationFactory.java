class UrgentNotificationFactory implements INotificationFactory {

  public EmailNotification createEmailNotification() {
    return new UrgentEmailNotification();
  }

  public SmsNotification createSmsNotification() {
    return new UrgentSmsNotification();
  }

  public PushNotification createPushNotification() {
    return new UrgentPushNotification();
  }
}