public class Main {
  public static void main(String[] args) {
    String variant = "regular";

    INotificationFactory notificationFactory = INotificationFactory.geFactory(variant);

    EmailNotification emailNotification = notificationFactory.createEmailNotification();
    SmsNotification smsNotification = notificationFactory.createSmsNotification();

    emailNotification.sendEmail("Email Header");
    smsNotification.sendSms("Your account is credited with 1,87,000 INR");
  }
}
