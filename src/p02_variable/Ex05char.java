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

    // 특수 문자 리터럴
    char c4 = '\''; // ' 출력
    char c5 = '\"'; // " 출력
    char c6 = '\\'; // \ 출력
    char c7 = '\b'; // 백스페이스
    char c8 = '\t'; // tab
    char c9 = '\n'; // 개행,한줄내려쓰기
    char c10 = '\r'; // 캐리지 리턴
    char c11 = '\f'; // 폼피드
    char c12 = '\u0000'; // 공백의 헥사값
    c12 = ' '; // 기본값, 공백
  }
}
