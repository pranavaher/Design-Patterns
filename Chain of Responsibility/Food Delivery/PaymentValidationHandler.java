public class PaymentValidationHandler extends OrderHandler {
  @Override
  public boolean handle(OrderRequest order) {
    if(!order.isPaymentValid) {
      System.out.println("❌ Payment failed.");
      return false;
    }
    
    System.out.println("✅ Payment validated.");
    return next == null || next.handle(order);
  }
}

