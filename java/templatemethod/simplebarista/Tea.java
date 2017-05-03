public class Tea {
  
  void prepareRecipe() {
    boilWater();
    brewCoffeeGrinds();
    pourInCup();
    addLemon();
  }
  
  public void boilWater() {
		System.out.println("Boiling water");
  }
  
  public void brewCoffeeGrinds() {
		System.out.println("Steeping the tea");
  }
  
  public void pourInCup() {
		System.out.println("Pouring into cup");
  }
  
  public void addLemon() {
		System.out.println("Adding Lemon");
  }
}