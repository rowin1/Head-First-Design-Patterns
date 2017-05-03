/* 
  This design could be made better using the Template Method Pattern
*/

public class Barista {
  
  public static void main(String[] args) {
    Tea tea = new Tea();
    Coffee coffee = new Coffee();
    System.out.println("Making tea...");
		tea.prepareRecipe();
		System.out.println("Making coffee...");
		coffee.prepareRecipe();
  }
}

