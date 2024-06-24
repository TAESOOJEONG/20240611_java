package p05_inherit;

public class Ex11Singleton {
  public static void main(String[] args) {
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    System.out.println(s1);
    System.out.println(s2);

  }
}

class Singleton {
  static private Singleton singleton;

  private Singleton() {
  }

  static public Singleton getInstance() {
    //  return (singleton == null) ? new Singleton() : singleton;
    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }
}