import java.util.Arrays;

public class main {
  public static void main(String[] args) {
    OrderRequest order = new OrderRequest("KFC", Arrays.asList("Burger", "Fries"), true, "Downtown", "user123" );


    OrderHandler orderConfirmationHandler = new OrderConfirmationHandler();  
    OrderHandler deliveryPartnerHandler = new DeliveryPartnerAssignmentHandler();  
    OrderHandler deliveryZoneHandler = new DeliveryZoneHandler();  
    OrderHandler paymentHandler = new PaymentValidationHandler();  
    OrderHandler itemAvailabilityHandler = new ItemAvailabilityHandler();  
    OrderHandler restaurantHandler = new RestaurantAvailabilityHandler();

    restaurantHandler.setNext(itemAvailabilityHandler);
    itemAvailabilityHandler.setNext(paymentHandler);
    paymentHandler.setNext(deliveryZoneHandler);
    deliveryZoneHandler.setNext(deliveryPartnerHandler);
    deliveryPartnerHandler.setNext(orderConfirmationHandler);

    System.out.println("📦 Starting order processing...\n");
    boolean result = restaurantHandler.handle(order);

    if (!result) {
        System.out.println("\n❗ Order failed.");
    } else {
        System.out.println("\n✅ Order completed successfully!");
    }
    
  }
}
