public class Main {
  public static void main(String[] args) {
    NotificationDirector director = new NotificationDirector();

    Notification regular = director.buildNotification(new RegularNotificationBuilder());

    regular.display();
  }
}
