interface INotificationFactory {
  EmailNotification createEmailNotification();
  PushNotification createPushNotification();
  SmsNotification createSmsNotification();

  static INotificationFactory geFactory(String type) {
    switch (type.toLowerCase()) {
      case "regular":
        return new RegularNotificationFactory();
      case "urgent":
        return new UrgentNotificationFactory();
      default:
        throw new IllegalArgumentException("Unknown type: " + type);
    }
  }
}
