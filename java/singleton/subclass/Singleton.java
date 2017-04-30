public class Singleton {
  
  protected static Singleton uniqueInstance;
  
  protected Singleton () {}
  
  public static synchronized Singleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }
    return uniqueInstance;
  }
}