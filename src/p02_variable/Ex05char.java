package p02_variable;

import common.Utils;
import jdk.jshell.execution.Util;
import p01_class.Animal;

import javax.swing.text.Utilities;

public class Ex05char {
  char chr;

  public static void main(String[] args) {
    char c1 = 'A'; // 65
    Utils.typeOf(c1);
    System.out.println((int) c1);
    System.out.println(c1 + c1); // 연산 할 경우 int로 형변환
    Utils.typeOf(c1+c1);
    char c2 = 'a'; // 97
    Utils.typeOf(new Animal());
    int c3 = '0'; // 48
    System.out.println(c3);
    // char c4 = ' '; char 에러발생
    Ex05char ex05char = new Ex05char();
    System.out.println(ex05char.chr);
    // 공백의 HEXA 코드값 = '\u0000' = ' '
    Utils.typeOf(' ');
    if (ex05char.chr == '\u0000'){
      System.out.println("공백이 같습니다.");
    }
    if (ex05char.chr == ' '){
      System.out.println("공백이 같습니다.");
    }

  }
}
