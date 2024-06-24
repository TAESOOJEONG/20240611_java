package p05_inherit;

public class Ex12inner {
  public static void main(String[] args) {
    Outer o = new Outer();
    Outer.Inner oi = new Outer().new Inner();
    System.out.println(oi.iv);
    Outer.InnerStaic ois = new Outer.InnerStaic();
    System.out.println(ois.isv);
    Outer.InnerInterface oii = new Outer.InnerInterface() {
      // 인터페이스는 new를 사용할 수 없지만 아래 재정의를 통해
      // 객체화 되면서 인스턴스 생성 가능이 됨.
      // 객체 -> 인터페이스 형변환 예시
      @Override
      public void innerMethod() {

      }
    };
  }
}

class Outer {
  class Inner {
    int iv = 100;
  }

  static class InnerStaic {
    int isv= 2000;
  }

  void outerMethod() {
    class LocalInner {
      int localInerVar = 300;
    }
  }

  interface InnerInterface {
    void innerMethod();
  }
}