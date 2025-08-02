// Concrete Handler

public class RestaurantAvailabilityHandler extends OrderHandler {
  @Override
  public boolean handle(OrderRequest order) {
    if(order.restaurant.equalsIgnoreCase("ClosedRestaurant")) {
      System.out.println("❌ Restaurant is closed.");
      return false;
    }
    System.out.println("✅ Restaurant accepting orders.");
    return next == null || next.handle(order);
  }
}

