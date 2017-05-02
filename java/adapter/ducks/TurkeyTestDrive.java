public class TurkeyTestDrive {
  
  public static void main(String[] args) {
  WildTurkey turkey = new WildTurkey();
  
  MallardDuck duck = new MallardDuck();
  DuckAdapter duckAdapter = new DuckAdapter(duck);
  
  System.out.println("The Duck says...");
  duck.quack();
  duck.fly();
  
  System.out.println("The Turkey says...");
  testTurkey(turkey);
  
  System.out.println("The DuckAdapter says...");
  testTurkey(duckAdapter);
  }
  
  static void testTurkey(Turkey turkey) {
    turkey.gobble();
    turkey.fly();
  }
}