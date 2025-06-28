class UrgentEmailNotification implements EmailNotification {
  @Override
  public void sendEmail(String s) {
    System.out.println("Urgent Email: " + s);
  }
}
