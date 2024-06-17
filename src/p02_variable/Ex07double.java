package p02_variable;

import common.Utils;

public class Ex07double {
  public static void main(String[] args) {
    // float :: -3.4*10^38 ~ 3.4*10^38 (정밀도 : 소수 7째자리)
    // double :: -1.7*10^308 ~ 1.7*10^308 (정밀도 : 소수 13째자리)
    float f1 = 0.0f;
    double d1 = 0.0; // d생략가능

    Utils.typeOf(0.0);
    Utils.typeOf(0.0f);
    int i1 = 10;
    long l1 = 1000;
    Utils.typeOf(0.0f + i1);
    Utils.typeOf(0.0f + l1); // 표현 범위가 큰 타입으로 형변환
    Utils.typeOf(f1 +d1 );
    d1 = f1; // 묵시적 형변환
    Utils.typeOf(d1);
    f1 = (float)d1; // 명시적 현변환
    Utils.typeOf(f1);




  }
}
