abstract class CookingRecipe {
  // Template Method
  public final void cookRecipe() {
    boilWater();
    addMainIngredient();
    addSpices();
    cookForDuration();
    serveDish();
  }

  private void boilWater() {
    System.out.println("Boiling water...");
  }
  
  protected abstract void addMainIngredient();
  protected abstract void addSpices();
  
  private void cookForDuration() {
    System.out.println("Cooking for required duration...");
  }

  private void serveDish() {
    System.out.println("Serving the dish on a plate!!");
  }
}

