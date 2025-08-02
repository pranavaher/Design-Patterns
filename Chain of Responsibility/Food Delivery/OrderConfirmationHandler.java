public class OrderConfirmationHandler extends OrderHandler {
  @Override
  public boolean handle(OrderRequest request) {
    System.out.println("🎉 Order confirmed for user: " + request.userId);
    return true;
  }
}
