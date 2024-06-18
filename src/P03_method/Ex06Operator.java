package P03_method;

public class Ex06Operator {

  public static void main(String[] args) {
    System.out.println(" 사칙 연산자 : +, -, *, / ");
    System.out.println(" 나머지 연산자 : % ");
    System.out.println(" 증감 연산자 : ++, --(단항 연산자)");
    int a = 1;
    System.out.printf("a = %d\n",a);
    System.out.printf("a++ = %d, ++a = %d\n", a++, ++a);

    a= 1;
    System.out.printf("a++ : %d %d %d %d %d \n", a++, a++,a++,a++,a++);
    a= 1;
    System.out.printf("a++ : %d %d %d %d %d \n", ++a, ++a,++a,++a,++a);
    a=1;
    int s = a++ + a++ + ++a;
    System.out.printf("s : %d\n", s);
    System.out.println("대입 연산자 +=, -=, *=, /=, %=");
    System.out.println("a:" +a);
    a+=1; // a=a+1;
    a-=1; // a=a-1;
    a-=1 +s; // a = a - (1+s);
    System.out.println(a);
    a = 1;
    a *=2 +a; // a = a*(2+a)
    System.out.println(a);
    System.out.println("비교 연산자 >, >=, <, <=, !=, == ");
    System.out.println(100>10); //true or false
    System.out.println("논리 연산자 ||, &&, !, xorBool ");
    System.out.println(10>2 && 2 > 10); // 논리곱 직렬 스위치 -> false가 1개라도 있으면 false
    System.out.println(10>2 || 10 <2);  // 논리합 병렬 스위치 -> true가 1개라도 있으면 true
    // System.out.println(xorBool);
    System.out.println(10!= 2); // 10이 2가 아님 -> true
    System.out.println("shift 연산자 >>,<<");
    a= 2;
    System.out.println(a<<2); // 2진수로 변환 후 왼쪽 2번옮김
                              // ex 2 = 10 , 8 = 1000
    System.out.println("bit 연산자 |, &, ^, ~ ");
    System.out.println(2 | 1);  // ->  0 0 1 0
                                //   | 0 0 0 1
                                //    ==========
                                //     0 0 1 1

    System.out.println(2 & 3);  // ->   0 0 1 0
                                //    & 0 0 1 1
                                //   ============
                                //      0 0 1 0

    System.out.println(2 ^ 1);  // ->   0 0 1 0
                                //    ^ 0 0 0 1
                                //   =============
                                //      0 0 1 1

    System.out.println(~1);   //
    //                           a가0보다 큰게 참일 때 : 거짓일 때
    System.out.println("a:" + (a =-1) +(a>0 ? "양수":"음수"));

  }
}
