public class NotificationDirector {
  public NotificationMessage buildNotification(NotificationBuilder builder) {
    builder.applyUserInput();
    
    builder.setChannel();
    builder.setPriority();
    
    return builder.getNotification();
  }
}
