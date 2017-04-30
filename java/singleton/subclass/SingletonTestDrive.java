public class SingletonTestDrive {
  
  public static void main(String[] args) {
    Singleton foo = CoolerSingleton.getInstance();
    Singleton bar = HotterSingleton.getInstance();
    System.out.println(foo);
    System.out.println(bar);
  }
}

// 'foo' and 'bar' are the same object here.