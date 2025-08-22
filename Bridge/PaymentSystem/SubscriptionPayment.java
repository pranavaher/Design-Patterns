// Refined Abstraction

public class SubscriptionPayment extends Payment {
  SubscriptionPayment(PaymentGateway paymentGateway) {
    super(paymentGateway);
  }

  @Override
  public void pay(double amount) {
    System.out.println("Initiating subscription payment...");
    paymentGateway.processPayment(amount);
  }
}
