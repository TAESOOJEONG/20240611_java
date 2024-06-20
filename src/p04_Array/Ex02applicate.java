package p04_Array;

import common.Utils;

public class Ex02applicate {
  public static void main(String[] args) {
    int[] score = new int[10];
    for (int i = 0; i < 10; i++) {
      score[i] = (int) (Math.random() * 30 + 70);
      System.out.println(score[i]);

    }

    // System.out.println(Arrays.toString(score));
    prArr(score);
    maxArr(score);
    minArr(score);
    sumArr(score);
    avgArr(score);


  }

  public static void minArr(int[] arr) {
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (min > arr[i]) {
        min = arr[i];
      }
    }
    System.out.println("min : " + min);
  }

  public static int sumArr(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println("sum : " + sum);
    return sum;
  }

  public static double avgArr(int[] arr) {
    double avg = 0;
    double sum = 0;
    for (int i = 0; i < 10; i++) {
      sum += arr[i];
      avg =sum / 10;
    }
    System.out.println("avg : " + avg);
    return avg;
  }




  public static void maxArr(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    System.out.println("max : " + max);
  }


  public static void prArr(int[] arr) {
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      if (i != 0) System.out.print(",");
      System.out.print(arr[i] + "");
    }
    System.out.print("]");
    System.out.println();
  }

}
