public class Main {
  public static void main(String[] args) {  
    NotificationSender sender1 = NotificationSender.getSender();
    Notification n1 = new Notification("WELCOME EMAIL", "We are glad to welcome you onboard", "donaldtrump@gmail.com");
    sender1.send(n1);

    NotificationSender sender2 = NotificationSender.getSender();
    Notification n2 = new Notification("DELETE ACCOUNT CONFIRMATION", "We are sorry to let you go", "elonmusk@gmail.com");
    sender2.send(n2);

    System.out.println("\n");
    System.out.println("Same sender? " + (sender1 == sender2));
  }
}