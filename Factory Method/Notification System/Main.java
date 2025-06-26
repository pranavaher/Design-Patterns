public class Main {
  public static void main(String [] args) {
    System.out.println("");

    NotificationFactory emailFactory = new EmailNotificationFactory();
    INotification emailNotification = emailFactory.createNotification();
    emailNotification.sendNotification("Hello Google");

    NotificationFactory whatsappFactory = new WhatsappNotificationFactory();
    INotification whatsappNotification = whatsappFactory.createNotification();
    whatsappNotification.sendNotification("Whatsapp ki taraf se apkoo Saat karoood ki lotter lagi hai.");

    System.out.println("");
  }
}
