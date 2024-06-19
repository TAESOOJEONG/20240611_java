package P03_method;

public class Ex09For {
  public static void main(String[] args) {
    // for 문도 소괄호안의 내용은 for 뒤 중괄호 안에서만 유효함
    // 반복문을 구현할 때
    // 첫번째 패턴파악
    // 두번 째 초기값, 조건, 증감 적용
   /* int sum = 0;
    sum = sum + 1;
    sum = sum + 2;
    sum = sum + 3;
    sum = 0;*/
    //for (int i = 9; i >= 0; --i)  sum = sum + i;

    //System.out.println(sum);
    int two = 0;
    for (int i = 2; i <= 9; ++i) {
      System.out.println("[" + i + " 단]");
      for (int j = 1; j < 10; j++) {
        System.out.printf("%d * %d = %2d \n", i, j, i * j);
      }
      System.out.println();
    }

    for (int i = 2; i < 10; i += 3) {
      for (int j = 1; j < 10; j++) {
        for (int k = 0; k < 3; k++) {

          System.out.printf("%d * %d = %2d \t",
              i + k, j, (i + k) * j);
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
