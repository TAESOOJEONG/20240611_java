package p07_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntUnaryOperator;

// Arrays : Collection에 배열을 다루기 위해 추가된 클래스
public class Ex03Arrays {
  public static void main(String[] args) {
    int[] arr = {0, 1, 2, 3, 4};
    int[] arr2 = Arrays.copyOf(arr, arr.length);
    int[] arr3 = Arrays.copyOfRange(arr, 2, 4);
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(arr2));
    System.out.println(Arrays.toString(arr3));
    int[] arr4 = new int[5];
    Arrays.fill(arr4, 10);
    System.out.println(Arrays.toString(arr4));
    Arrays.setAll(arr4, new IntUnaryOperator() {
          @Override
          public int applyAsInt(int operand) {
            return (int) (Math.random() * 5);
          }
        }
    );
    Arrays.sort(arr4);
    System.out.println(Arrays.toString(arr4));
    int idx = Arrays.binarySearch(arr4, 2);
    System.out.println(idx);
    int[][] arr2D = {{11, 12}, {21, 22}};
    System.out.println(Arrays.deepToString(arr2D));

    //배열을 list로 변환
    Integer[] arrInt1 = new Integer[]{0, 1, 2, 3};
    List<Integer> list = new ArrayList<>(Arrays.asList(arrInt1));
    System.out.println(list);

    // List를 배열로 변환
    // Integer[] arrInt2 = list.toArray(new Integer[list.size()]);
    // list를 배열로 변환하기 위해 배열을 단순히 참조, 그래서 0
    Integer[] arrInt2 = list.toArray(new Integer[0]);
    Integer[] arrInt3 = list.stream().toArray(Integer[] ::new);
    System.out.println(Arrays.toString(arrInt2));
  }
}
