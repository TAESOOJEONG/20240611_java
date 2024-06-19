package P03_method;

public class Ex10while {
  public static void main(String[] args) {
    int i = 2;
    int j = 1;
    while (i < 10) {
      j=1;
      while (j < 10) {
        System.out.printf("%d x %d = %2d\n", i, j, i * j++);
      }
      i++;
      System.out.println();
    }
  }
}