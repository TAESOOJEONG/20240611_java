package P03_method;

import javax.swing.*;
import java.util.Scanner;

public class Ex08Switchcase {
  public static void main(String[] args) {
    String input = JOptionPane.showInputDialog("당신이 태어난 달 입력: ");
    int birthMonth = Integer.parseInt(input); // 문자->숫자 형변환
    String result = "";
    switch (birthMonth) {
      case 3, 4, 5:
        result = "봄";
        break;
      case 6, 7, 8:
        result = "여름";
        break;
      case 9, 10, 11:
        result = "가을";
        break;
      case 12, 1, 2:
        result = "겨울";
        break;
      default:
        result = " 없는 달 ";
        break;
    }
    System.out.println(input + "월은 " + result + "입니다.");

    input = JOptionPane.showInputDialog("당신의 이름을 입력 : ");
    // 정 태 수 태 수
    // 0  1 2  3  4    아래는 0부터 1 전까지 = 0만 => 성씨만
    // ex substring(0,4) => 정태수태
    // ex substring(1) => 태수태수 => 1부터 끝까지
    String familyName = input.substring(0, 1);
    switch (familyName) {
      case "정":
        System.out.println("Jeong");
        break;
      case "김":
        System.out.println("Kim");
        break;
      case "이":
        System.out.println("Lee");
        break;
      case "박":
        System.out.println("Park");
        break;
      case "성":
        System.out.println("Seong");
        break;
      case "최":
        System.out.println("Choi");
        break;
      case "강":
        System.out.println("Kang");
        break;
    }

  }
}
