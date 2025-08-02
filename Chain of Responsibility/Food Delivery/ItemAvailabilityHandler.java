public class ItemAvailabilityHandler extends OrderHandler {
  @Override
  public boolean handle(OrderRequest order) {
    if(order.items.contains("UnavailableItem")) {
      System.out.println("❌ Some items are unavailable");
      return false;
    }
    System.out.println("✅ All items are available.");
    return next == null || next.handle(order);
  }
}

