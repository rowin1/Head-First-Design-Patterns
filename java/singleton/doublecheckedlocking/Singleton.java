public class Singleton {
  
  private volatile static Singleton uniqueInstance;
  
  private Singleton() {}
  
  public static Singleton getInstance() {
    if (uniqueInstance == null) {
      synchronized (Single.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new Singleton();
        }
      }
    }
  }
}

// Only synchronize the first time through.