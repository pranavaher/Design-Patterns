public class Main{
	public static void main(String[] args) {
		INotification notifier1 = NotificationFactory.createNotification("EMAIL");
		notifier1.sendNotification("Hello Google !!!");

		INotification notifier2 = NotificationFactory.createNotification("PUSH");
		notifier2.sendNotification("Hello Twillio !!!");

		// INotification notifier = NotificationFactory.createNotification("OUTLOOK");
		// notifier.sendNotification("Hello Microsoft !!!");
	}
}