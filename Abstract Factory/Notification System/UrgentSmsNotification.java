class UrgentSmsNotification implements SmsNotification {
  @Override
  public void sendSms(String s) {
    System.out.println("Urgent SMS: " + s);
  }
}
