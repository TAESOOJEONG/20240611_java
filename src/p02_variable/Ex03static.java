package p02_variable;

public class Ex03static {
  //static은 main()가 실행되기전 method area에 load됨.
  {System.out.println("인스턴스가 실행됩니다.");}
  static{System.out.println("static은 한번만 실행됩니다.");}
  static int vs;
  int vi;

  public void foo() {System.out.println(vi+vs);}

  public static void tiger(){
    System.out.println(vs);
   // 사용불가 System.out.println(vi);
  }

  public static void main(String[] args) {
    Ex03static e1 = new Ex03static();
    Ex03static e2 = new Ex03static();


/*    static은 공통의 값 inst은 각각의 값*/
    e1.vi = 10;
    System.out.println(e1.vi);
    e1.vi = 20;
    System.out.println(e1.vi);
    e1.vs = 100;
    System.out.println(e1.vs);
    e1.vs = 200;
    System.out.println(e1.vs);
  }
}
