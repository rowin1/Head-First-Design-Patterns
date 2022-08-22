public class DuckSimulator {
  public static void main(String[] args) {  
    Duck mallard = new MallardDuck(); // A duck object
    
    mallard.setFlyBehavior(new FlyWithWings()); // Set an Algorithm(Fly): FlyWithWings
    mallard.performFly(); // Fly based on Algorithm FlyWithWings
    
    // So I can change the algorithm in future with the help of Set method where I do not need to change existing code
    // and inject the updated or new algorithm
    
    mallard.setQuackBehavior(new Squeak()); // Set an Algorithm(Quack): Squeak
    mallard.performQuack(); // Quack based on Algorithm Squeak
    
    Duck model = new ModelDuck(); // Another duck object
    model.setFlyBehavior(new FlyRocketPowered());  //Set a Algorithm(Fly): FlyRocketPowered
    model.performFly(); // Fly based on Algorithm FlyRocketPowered
    
    // Suppose this kind of duck can not quack so create an algorithm (no quack ability) and inject it
    model.setQuackBehavior(new MuteQuack());
    model.performQuack();
  }
  
  //Note: We can also set the algorithms inside the duck object Class: MallardDuck or ModelDuck
  //But we may need to change the algorithm in future which violates open close principle
}