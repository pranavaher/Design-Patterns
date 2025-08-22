// Concrete Implementor

public class PayPalGateway implements PaymentGateway {
  @Override
  public void processPayment(double amount) {
    System.out.println("Processing payment of $" + amount + " via PayPal.");
  }
}

