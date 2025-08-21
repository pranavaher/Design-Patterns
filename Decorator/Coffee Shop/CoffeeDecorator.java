// Abstract Decorator

public abstract class CoffeeDecorator implements Coffee {
  protected Coffee decoratedCoffee;

  CoffeeDecorator(Coffee coffee) {
    this.decoratedCoffee = coffee;
  }

  @Override
  public double getCost() {
    return decoratedCoffee.getCost();
  }

  @Override
  public String getDescription() {
    return decoratedCoffee.getDescription();
  }
}
