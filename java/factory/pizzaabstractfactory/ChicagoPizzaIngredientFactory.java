public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
  
  public Dough createDough() {
    return new ThickCrustDough();
  }
  
  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }
  
  public Cheese createCheese() {
    return new MozzarellaCheese();
  }
  
  public Veggies[] createVeggies() {
    Veggies veggies[] = { new BlackOlives(), new Spinach(), new EggPlant()};
    return veggies;
  }
  
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }
  
  public Clams createClams() {
    return new FrozenClams();
  }
}