public class ModelDuck extends Duck {
  public ModelDuck(){
    //We also can set manually the algorithms from the class itself: like below code
  
	//quackBehavior = new Quack();
    //flyBehavior = new FlyWithWings();
  }
  
  public void display() {
    System.out.println("I'm a model duck");
  }
}