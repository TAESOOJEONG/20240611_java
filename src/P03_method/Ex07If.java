package P03_method;

import java.util.Scanner;

public class Ex07If {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("학점 입력 : ");
    int input = sc.nextInt();
    System.out.println(input);
    String result = "";
    String line = "";

    if (input % 10 >= 7) {
      line = "+";
    } else if (input % 10 >= 4) {
      line = "0";
    } else if (input % 10 >= 0) {
      line = "-";
    }

    if (input >= 90) {
      result = "A";
    } else if (input >= 80) {
      result = "B";
    } else if (input >= 70) {
      result = "C";
    } else if (input >= 60) {
      result = "D";
    } else if (input >= 0) {
      result = "F";
    }
    if (input == 100)
      System.out.println("학점 : A+");
    if (input >= 60 && input < 100)
      System.out.println("학점 : " + result + line);
    if (input <= 59)
      System.out.println("학점 : " + result);
  }
}