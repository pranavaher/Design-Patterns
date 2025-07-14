public class Main {
  public static void main(String[] args) {
    Notification notification1 = new Notification("Welcome", "We are glad to receive you", "PRANAV AEHR");
    notification1.display();

    Notification notification2 = notification1.clone();
    
    notification2.setTitle("Good Bye");
    notification2.setBody("We atre sad to let you go");
    notification2.setRecipient("John Cena");

    notification2.display();
  }
}
