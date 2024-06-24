package p05_inherit;

public class Ex06Interface {
  public static void main(String[] args) {
    Athlete athlete = new Athlete();
    System.out.println(athlete);

  }
}
// java에서 class는 다중상속이 안된다. 그래서, interface를 사용한다.
// 약속 ) 인터페이스 뒤에 able을 붙이거나 앞에 I를 붙이거나
class Athlete implements ISwim,IBicycle{

  public void swim() {
    // 중복된 상수는 static이 붙어있기 때문에 클래스와 함께 지정
    System.out.println(ISwim.LEVEL);
  }


  public void ride() {

  }

  public void run() {
  Triatholon.start();
  }
}
// interface는 추상 자료형. 반드시 class에서 implements 후에 사용
// 목적 : 클래스들이 구현해야 하는 동작(method)을 보완하기 위해 사용
// 장점 : 표준화가 가능
interface ISwim {
  // 추상 메서드와 상수만 정의(ver18부터 static, default 메서드 추가)
  public abstract void swim();
  public static final int LEVEL = 10;
}

interface IBicycle {
  void ride();
  int LEVEL = 20;
}

interface IMarathon {
  void run();
}

interface Triatholon extends ISwim, IBicycle, IMarathon {
  public default void complete() {
    swim();ride();run();
  }

  public static void start() {
    System.out.println("출발이다!");
  }
}