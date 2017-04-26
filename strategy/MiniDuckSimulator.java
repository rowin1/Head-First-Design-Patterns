public class MiniDuckSimulator {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performQuack(); // Quack
    mallard.performFly(); // I'm flying!!
    
    Duck model = new ModelDuck();
    model.performFly(); // I can't fly
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly(); // I'm flying with a rocket
  }
}