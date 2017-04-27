public class StarbuzzCoffee {
  
  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    printBeverage(beverage);
    
    Beverage beverage2 = new DarkRoast(); // Make a Dark Roast object.
    beverage2 = new Mocha(beverage2); // Wrap it with a Mocha.
    beverage2 = new Mocha(beverage2); // Wrap it in a second Mocha.
    beverage2 = new Whip(beverage2); // Wrap it in a Whip.
    printBeverage(beverage2);
    
    Beverage beverage3 = new HouseBlend();
    beverage3 = new Soy(beverage3);
    beverage3 = new Mocha(beverage3);
    beverage3 = new Whip(beverage3);
    printBeverage(beverage3);
  }
  
  public static void printBeverage(Beverage beverage) {
    System.out.println(beverage.getDescription() + " $" + beverage.cost());
  }
}