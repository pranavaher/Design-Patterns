public class Main {
  public static void main(String[] args) {

    PaymentGateway paypal = new PayPalGateway();
    PaymentGateway razropay = new RazorpayGateway();

    Payment oneTime = new OneTimePayment(paypal);
    oneTime.pay(100.0);

    Payment subscription = new SubscriptionPayment(razropay);
    subscription.pay(500.0);
  }
}
