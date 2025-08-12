public class MaggieRecipe extends CookingRecipe {
  @Override
  protected void addMainIngredient() {
    System.out.println("Adding Maggie in boiling water...");
  }
  
  @Override
  protected void addSpices() {
    System.out.println("Adding Masala, Salt, vegetables...");
  }
}

