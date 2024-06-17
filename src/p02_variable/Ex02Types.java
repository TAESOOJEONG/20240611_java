package p02_variable;

import p01_class.Animal;

public class Ex02Types {

  // 변수의 할당 = 선언 + 초기화
  // 멤버변수(광역변수)는 선언만해도 'new'를 통해 기본 값으로 초기화가 된다.
  // 멤버변수가 할당이 된 것은 new에서 제외

  //변수의 종류 크게: Primitive, Reference
  // Primitive type (일반 변수는 실제 값을 가짐)
  // Reference type (참조형 변수 주소값을 가짐.)
  boolean power;
  char c1;
  byte b1;
  short s1;
  int i1;
  long l1;
  float f1;
  double d1;
  String str;
  Animal animal;


  public static void main(String[] args) {
    /*    지역변수는 사용하기 위해서 반드시 할당을 해야함    */
    boolean power = true; // 논리형 1byte , true, false 값을 가짐
    char c1 = 'A';        // 문자형 2byte , 0~65535, 1글자만 가능
    byte b1 = 10;         // 정수형 1byte , -128 ~ +127
    short s1 = 10;        // 정수형 2byte , -32768 ~ +32767
    int i1 = 10;          // 정수형 4byte , -2147483648 ~ +2147483647
    long l1 = 10L;        // 정수형 8byte , -91경~91경
    float f1 = 0.1F;      // 실수형 4byte , 소수점 7자리까지의 정확도 10의-45승 ~ 10의 38승
    double d1 = 0.1d;     // 실수형 8byte , 소수점 13자리까지 정확도 10의 -324승 ~ 10^308승


    String str = "Hello";
    System.out.println(str);

    Animal animal = new Animal();
    System.out.println(animal);

    System.out.println("==================================");
    // 전역변수를 사용하기 위해서는 인스턴스를 만들어야 한다.
    Ex02Types ex02Types = new Ex02Types(); // 초기값
    System.out.println(ex02Types.power);   // false
    System.out.println(ex02Types.c1);      // 공백
    System.out.println(ex02Types.b1);      // 0
    System.out.println(ex02Types.s1);      // 0
    System.out.println(ex02Types.i1);      // 0
    System.out.println(ex02Types.l1);      // 0
    System.out.println(ex02Types.f1);      // 0.0
    System.out.println(ex02Types.d1);      // 0.0
    System.out.println(ex02Types.str);     // null
    System.out.println(ex02Types.animal);  // null

    int sum;
    //  System.out.println(sum); 선언은 되었지만 초기화(할당)가 안됨
    System.out.println(d1);
  }
}
