// Refined Abstraction

public class OneTimePayment extends Payment {
  OneTimePayment(PaymentGateway paymentGateway) {
    super(paymentGateway);
  }

  @Override
  public void pay(double amount) {
    System.out.println("Initiating one-time payment...");
    paymentGateway.processPayment(amount);
  }
}

