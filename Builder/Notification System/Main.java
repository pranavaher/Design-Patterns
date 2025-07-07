public class Main {
  public static void main(String[] args) {
    NotificationDirector director = new NotificationDirector();

    NotificationBuilder regularBuilder = new RegularNotificationBuilder()
            .setTitle("Welcome!")
            .setBody("Thanks for registering.")
            .setRecipient("pranav@example.com");

    NotificationMessage notificationMessage = director.buildNotification(regularBuilder);
    notificationMessage.display();
  }
}
