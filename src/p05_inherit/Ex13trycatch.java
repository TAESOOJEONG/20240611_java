package p05_inherit;

public class Ex13trycatch {
  public static void main(String[] args) {
    System.out.println(1);
    System.out.println(2);
    System.out.println(3);

    try {
      System.out.println(10/0);
      System.out.println(4);
    } catch (Exception e) {
      System.out.println("예외 발생");
      // 예외 발생해도 finally는 출력 됨.
    } finally{
      System.out.println(5);
    }
    System.out.println(6);
    System.out.println(7);
    System.out.println(8);
    // TryWithResource문은 입출력에서 다룰 것
  }
}
