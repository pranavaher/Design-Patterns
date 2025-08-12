public class Main {
  public static void main(String[] args) {
    CookingRecipe maggie = new MaggieRecipe();
    System.out.println("=== Cooking Maggie ===");
    maggie.cookRecipe();

    System.out.println();

    CookingRecipe friedRice = new FriedRiceRecipe();
    System.out.println("=== Cooking Fried Rice ===");
    friedRice.cookRecipe();
  }
}

