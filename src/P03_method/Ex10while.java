package P03_method;

import javax.swing.*;
import java.util.Scanner;

public class Ex10while {
  public static void main(String[] args) {
    int i = 2;
    int j = 1;
    while (i < 10) {
      j = 1;
      while (j < 10) {
        System.out.printf("%d x %d = %2d\n", i, j, i * j++);
      }
      i++;
      System.out.println();
    }
    i = 2;


    System.out.println("내 마음의 숫자를 맞춰봐(1~100)");
    boolean stop = false;
    while (true) {
      //Math.random() 0보다크고 1보다 작은 실수 ex 0.1~~ , 0.2~~, 0.7~~
      int random = (int) (Math.random() * 100) + 1;
      if (stop) break;

      while (true) {
        String input = JOptionPane.showInputDialog("숫자를 입력하세요(종료는Q,q)");
        if (input.toLowerCase().equals("q")) {
          stop = true;
          break;

        } else {
          int answer = Integer.parseInt(input);

          if (answer > random) {
            System.out.println("그것 보다 작다.");
          } else if (answer < random) {
            System.out.println("그것 보다 큽니다.");
          } else {
            System.out.println("정답.");
          }


        }
      }
    }
  }
}

