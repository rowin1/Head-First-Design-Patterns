public class Singleton {
  
  private static Singleton uniqueInstance;
  
  private Singleton() {}
  
  public static synchronized Singleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }
    return uniqueInstance;
  }
}

/* 
    Synchronization is expensive and there is totally 
    unneeded overhead after the first time through.
*/