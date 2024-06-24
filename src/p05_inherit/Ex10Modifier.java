package p05_inherit;

import common.Utils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex10Modifier {
  // 접근 제어자(Access Modifier) : public, protected, default, private)
  public String publicVar;      // 다른 패키지 사용가능
  protected String protectedVar; // 상속 받으면, 다른 패키지에서 사용 가능
          // common 패키지에서 사용
  String defaultVar;      // 같은 패키지내에서 사용가능
  private String privateVar; // 같은 클래스내에서 사용가능
  // 메서드 앞에도 접근 제어자 4가지 다 붙음.

  public static void main(String[] args) {

    // private int num =1 ; ※ 지역변수는 접근 제어자 사용 불가
    // 지역변수를 익명객체에서 사용할 때는 final사용,java8부터 안 붙여도 됨.
    final int result = 10;
    new JButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println(result);
        // result=10; 상수라서 사용은 가능
        // 지역변수는 익명객체에서 변경 불가
      }
    });
    FinalClass finalClass = new FinalClass();
    System.out.println(finalClass);

    //java10부터 var사용가능
    var name2= 123;   // 선언과 초기화 분리적용 안 됨.
    var name = "JTS"; // 동적할당 가능, 단 지역변수 일 때
    name = "jts";
    Utils.typeOf(name);
    Utils.typeOf(name2);
    System.out.println(name);
    System.out.println(name2);

  }
}

// final이 class 앞에 붙을 때 상속이 안됨.
final class FinalClass {
}

// class FinalParents extends FinalClass;
