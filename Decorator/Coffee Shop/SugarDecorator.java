// SUGAR Concrete Decorator

public class SugarDecorator extends CoffeeDecorator {
  private double price;

  public SugarDecorator(Coffee coffee, double price) {
    super(coffee);
    this.price = price;
  }

  @Override
  public double getCost() {
    return decoratedCoffee.getCost() + price;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + " + Sugar";
  }
}
