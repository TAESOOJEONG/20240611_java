package p05_inherit;

import java.security.Provider;

public class Ex02Object {
  public static void main(String[] args) {
    Member m1 = new Member("JTS", "010-3911-7066");
    String str = new String("hello");
    System.out.println(m1);
    System.out.println(str);
    System.out.println(m1 instanceof Object);
    System.out.println(m1 instanceof Member);
    //System.out.println(m1 instanceof String);
  }
}

// 모든 클래스는 Object를 상속받는다. 안써도 기본적으로 상속 됨.

class Member extends Object{
  // Object의 메서드 9가지
  String name, mobile;

  public Member(String name, String mobile) {
    this.name = name;
    this.mobile = mobile;
  }

  @Override
  public String toString() {
    return String.format(
        "name : %s, mobile : %s", name, mobile
    );
  }
}

class Phone { int key;}
class Computer{int key;}
// java는 다중상속을 허용하지 않는다.명확하기 때문에
// class SmartPhone extends Phone, Computer {}