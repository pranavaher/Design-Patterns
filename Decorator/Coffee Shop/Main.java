public class Main {
  public static void main(String[] args) {
    // Create Coffee first
    Coffee coffee = new SimpleCoffee();
    System.out.println(coffee.getDescription() + "-> " + coffee.getCost());
    
    // Add Milk
    coffee = new MilkDecorator(coffee, 20.0);
    System.out.println(coffee.getDescription() + "-> " + coffee.getCost());
    
    // Add Sugar
    coffee = new SugarDecorator(coffee, 30.0);
    System.out.println(coffee.getDescription() + "-> " + coffee.getCost());
  }
}
