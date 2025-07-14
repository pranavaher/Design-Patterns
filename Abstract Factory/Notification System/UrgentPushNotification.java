class UrgentPushNotification implements PushNotification {
  @Override
  public void sendPush(String s) {
    System.out.println("Urgent Push: " + s);
  }
}
