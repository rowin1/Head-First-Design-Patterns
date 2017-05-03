public class BeverageTestDrive {
  
  public static void main(String[] args) {
    Tea tea = new Tea();
		Coffee coffee = new Coffee();
 
		System.out.println("\nMaking tea...");
		tea.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();
    
    TeaWithHook teaWithHook = new TeaWithHook();
    CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
    
    System.out.println("\nMaking tea...");
		teaWithHook.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffeeWithHook.prepareRecipe();
  }
}