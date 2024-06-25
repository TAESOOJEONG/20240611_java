package p05_inherit;
//인스턴스 1개만 쓰기위해 사용
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