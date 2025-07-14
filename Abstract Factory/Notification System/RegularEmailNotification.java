class RegularEmailNotification implements EmailNotification {
  @Override
  public void sendEmail(String s) {
    System.out.println("Regular Email: " + s);
  }
}