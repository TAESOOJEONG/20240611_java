package p04_Array;

import common.Utils;

public class Ex01Array {
  public static void main(String[] args) {
    // 배열 : 같은 변수의 이름으로 반복되는 작업을 위한 저장공간

    // 선언과 초기화
    // int[] arr = new int[10];

    // 선언과 초기화 분리
    // int[] arr;
    // arr = new int[10];

    // 선언과 초기화와 직접 값 입력
    // int [] arr = new int[]{0,1,2,3};
    int[] arr = {0, 1, 2, 3};

    Object[] objects = new Object[5];
    String[] strings = new String[3];
    Utils.typeOf(arr);
    Utils.typeOf(objects);
    Utils.typeOf(strings);
    System.out.println(arr.length);
    System.out.println(objects.length);
    System.out.println(strings.length);
    // 배열선언 -> length 속성이 따라옴 // 모든 배열은 객체(참조형변수)다
    System.out.println(arr[0]);
    System.out.println(objects[4]);
    System.out.println(strings[2]);
    arr[0] = 1;
    arr[1] = 2;
    System.out.println(arr[1]);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * 10);
      arr[i] = i;
      System.out.println(arr[i]);


    }
    System.out.println("=========배열의 합=========");
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    System.out.println(sum);
  }
}
