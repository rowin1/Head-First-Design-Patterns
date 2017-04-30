public class Singleton {
  
  private static Singleton uniqueInstance = new Singleton();
  
  private Singleton() {}
  
  public static Singleton getInstance() {
    return uniqueInstance;
  }
}

/* 
    If your application always creates and uses an instance of the Singleton
    or the overhead of creation and runtime aspects of the Singleton are not
    onerous, this can create your Singleton eagerly.
*/
