public abstract class CaffeineBeverage {
  
  public void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }
  
  abstract void brew();
  
  abstract void addCondiments();
  
  public void boilWater() {
    System.out.println("Boiling water");
  }
  
  public void pourInCup() {
    System.out.println("Pouring into cup");
  }
}