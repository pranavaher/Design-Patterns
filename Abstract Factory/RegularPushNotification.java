class RegularPushNotification implements PushNotification {
  @Override
  public void sendPush(String s) {
    System.out.println("Regular Push: " + s);
  }
}
