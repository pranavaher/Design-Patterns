public class DeliveryZoneHandler extends OrderHandler {
  @Override
  public boolean handle(OrderRequest order) {
    if(order.deliveryAddress.equalsIgnoreCase("UnserviceableArea")) {
      System.out.println("❌ Delivery not available to this area.");
      return false;
    }
    System.out.println("✅ Delivery zone is serviceable.");
    return next == null || next.handle(order);
  }
}

