public class FriedRiceRecipe extends CookingRecipe {
  @Override
  protected void addMainIngredient() {
    System.out.println("Adding Rice in boiling water...");
  }
  
  @Override
  protected void addSpices() {
    System.out.println("Adding Masala, soya sauce, veges, pepper...");
  }
}

