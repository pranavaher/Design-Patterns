public class NotificationDirector {
  public Notification buildNotification(NotificationBuilder builder) {
        return builder.buildTitle()
                      .buildBody()
                      .buildRecipient()
                      .buildChannel()
                      .buildPriority()
                      .build();
    }
}
