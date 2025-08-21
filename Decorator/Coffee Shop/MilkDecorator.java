// MILK Concrete Decorator

public class MilkDecorator extends CoffeeDecorator {
  private double price;

  public MilkDecorator(Coffee coffee, double price) {
    super(coffee);
    this.price = price; 
  }

  @Override
  public double getCost() {
    return decoratedCoffee.getCost() + price;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + " + Milk";
  }
}
