package p02_variable;

import common.Utils;

public class Ex06int {
  public static void main(String[] args) {
    byte b1 = 100;
    //byte b2 = 200;
    byte b3 = 100;
    Utils.typeOf(b1 + b3);
    //byte b4 = b1+b3;
    System.out.println(b1 + b3);
    byte b4 = (byte) (b1 + b3);
    Utils.typeOf(b4);
    System.out.println(b4);

    // 규칙1. boolean 4byte 이하 자료형은 int로 변환 후 연산
    short s1 = 1000;
    short s2 = 1000;
    // 규칙2. 표현범위가 큰 것이 작은것으로 올 때는 명시적 형변환
    short s3 = (short) (s1 + s2); // 명시적 형변환
    Utils.typeOf(s3);
    System.out.println(s3);

    // 규칙3. 표현범위가 작은것이 큰 것으로올 때는 묵시적 형변환
    int i1 = s1 + s2 ;
    System.out.println(i1);
    long l1 = 200L; // long = long
    long l2 = 200; // long = int, long 12 = (long) 200; 묵시적 형변환

    int i2 = (int) l2; // 큰범위가 작은 범위로 올 때는 명시적 선언 ex (int)
    long result = i2 + l1;
    Utils.typeOf(result); //long과 연산을 할 경우 long타입으로 형변환

    int i3 = b1; // int=byte :: 묵시적 형변환
    byte b5 =(byte) i3; // 명시적 형변환


  }
}
