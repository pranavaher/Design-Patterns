public class MobileDisplay implements IObserver {
  private double price;

  @Override
  public void update(double price) {
    this.price = price;
    display();
  }

  private void display() {
    System.out.println("MOBILE: Stock Price $ " + price);
  }
}