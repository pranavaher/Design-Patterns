// Abstract Handler

public abstract class OrderHandler {
  protected OrderHandler next;

  public OrderHandler setNext(OrderHandler next) {
    this.next = next;
    return next;
  }

  public abstract boolean handle(OrderRequest order);
}

