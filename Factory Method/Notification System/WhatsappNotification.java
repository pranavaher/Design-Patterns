public class WhatsappNotification implements INotification {
  @Override
  public void sendNotification(String message) {
    System.out.println("Sending Whatsapp: " + message);
  }
}
