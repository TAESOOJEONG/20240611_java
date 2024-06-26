package p07_Collection;

import java.util.TreeSet;

public class Ex07TreeSet {
  public static void main(String[] args) {

    TreeSet set = new TreeSet();
    set.add(new Ball(4));
    set.add(new Ball(1));
    set.add(new Ball(3));
    System.out.println(set);
  }
}

class Ball {
  private int num;

    public Ball(int num) {
      this.num=num;
    }

  @Override
  public String toString() {
    return num + "" ;
  }
}