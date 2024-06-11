package p02_variable;

import p01_class.Animal;

public class Ex02Types {
  public static void main(String[] args) {
    //변수의 종류 크게: Primitive, Reference
    // Primitive type (일반 변수는 실제 값을 가짐)
    boolean power = true; // 논리형 1byte , true, false 값을 가짐
    char c1 = 'A';        // 문자형 2byte , 0~65535, 1글자만 가능
    byte b1 = 10;         // 정수형 1byte , -128 ~ +127
    short s1 = 10;        // 정수형 2byte , -32768 ~ +32767
    int i1 = 10;          // 정수형 4byte , -2147483648 ~ +2147483647
    long l1 = 10L;        // 정수형 8byte , -91경~91경
    float f1 = 0.1F;      // 실수형 4byte , 소수점 7자리까지의 정확도 10의-45승 ~ 10의 38승
    double d1 = 0.1d;     // 실수형 8byte , 소수점 13자리까지 정확도 10의 -324승 ~ 10^308승

    // Reference type (참조형 변수 주소값을 가짐.)
    String str = "Hello";  System.out.println(str);
    Animal animal = new Animal();  System.out.println(animal);



  }
}
