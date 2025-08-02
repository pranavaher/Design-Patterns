public class DeliveryPartnerAssignmentHandler extends OrderHandler {
  @Override
  public boolean handle(OrderRequest request) {
    boolean deliveryAvailable = Math.random() > 0.3;

    if (!deliveryAvailable) {
      System.out.println("❌ No delivery partner available.");
      return false;
    }
    System.out.println("✅ Delivery partner assigned.");
    return next == null || next.handle(request);
  }
}

