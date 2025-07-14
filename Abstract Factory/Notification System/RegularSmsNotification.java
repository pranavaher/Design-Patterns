class RegularSmsNotification implements SmsNotification {
  @Override
  public void sendSms(String s) {
    System.out.println("Regular SMS: " + s);
  }
}
