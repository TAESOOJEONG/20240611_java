package p02_variable;

import javax.swing.*;

public class Ex08Final {
  public static void main(String[] args) {
    // final 상수 :: 값이 할당되면 이후는 변경되지 않음
    final int GAUS_VAL;
    GAUS_VAL = 10;
    System.out.println(GAUS_VAL);
    // GAUS_VAL = 20;
    final String INPUT;
    INPUT = JOptionPane.showInputDialog("아이디를 입력하세요");
    System.out.println(INPUT);

  }
}
