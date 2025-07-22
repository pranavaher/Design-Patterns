public class EmailAlert implements IObserver {
  @Override
  public void update(double price) {
    send(price);
  }

  private void send(double price) {
    System.out.println("EMAIL: Stock Price $ " + price);
  }
}
