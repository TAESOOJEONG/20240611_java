package P03_method;

public class EX01declare {
  boolean b1;
  // return type
  // return 이 있는 경우 : void
  // return 이 없는경우 : primitive(8가지), reference(1가지)
  // void, primitive, reference (10가지)

  void print1() {
    System.out.println("Hello method~!");
    // return; // 암묵적으로 return 생략
  }

  boolean print2() {
    /* boolean result;
    EX01declare ex01declare = new EX01declare();
    result = ex01declare.b1;
    return result; */
    return new EX01declare().b1;

  }

  char print3() {
    return 'C';
  }

  int print4() {
    return 10;

  }

  double print5() {
    System.out.println("double");
    return 10;
    // System.out.println(); // return이후의 문장은 효용 없음.
  }

  int print6() {
    return (int) 0.0;
  }

  boolean print() {
    boolean result = false;
    return result;
  }

  boolean print(boolean result) {
    return result;
  }

  char print(char c) {
    return c;
  }

  int print(int i) {
    return i;
  }

  double print(double d) {
    return d;
  }

  public static void main(String[] args) {
    EX01declare e1 = new EX01declare();
    e1.print1();
    System.out.println(e1.print2());
    System.out.println(e1.print());
    System.out.println(e1.print(true));
    System.out.println(e1.print('Z'));
    System.out.println(e1.print(960118));
    System.out.println(e1.print(01.18));
    System.out.println(MyMath.divide(10, 3));
    System.out.println(Math.max(1, 3));
    System.out.println(MyMath.share(10, 3));
    System.out.println(MyMath.remain(10, 3));
    MyMath.shareRemain(10, 3);

    System.out.println(MyMath.add(1,3));
  }

}

class MyMath {
  // 매서드가 가지는 성격
  // 1) 객체의 속성(상태)을 처리하는 기능
  // 2) 객체의 속성(상태)을 온전하게 만들어 줌.
  // 3) 보호기능 :: ( tv의 채널,볼륨 )
  static double add(int n1, int n2) {
    // return n1+ n2 + 0.0;
    return (double) (n1 + n2);
  }

  static int subtract(int n1, int n2) {
    return n1 - n2;
  }

  static int multiply(int n1, int n2) {
    return n1 * n2;
  }

  static double divide(int n1, int n2) {
    double result = (double) n1 / n2;
    //double result = n1/ n2;
    return result;
  }

  static int share(int s1, int s2) {
    return s1 / s2;
  }

  static int remain(int s1, int s2) {
    return s1 % s2;


  }

  public static void shareRemain(int n1, int n2) {
    // System.out.println("몫 : " + share(n1, n2));
    //System.out.println("나머지 : " + remain(n1, n2));
    System.out.println("몫은" + share(n1, n2) + "나머지는" + remain(n1, n2));
    System.out.printf("몫 : %d ,나머지 :%d \n", share(n1, n2), remain(n1, n2));
    System.out.println(String.format("몫은 %d 나머지는 %d", share(n1, n2), remain(n1, n2)));
  }

}
