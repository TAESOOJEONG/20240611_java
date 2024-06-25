package p07_Collection;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex02LinkedList {
  public static void main(String[] args) {
    List al = new ArrayList();
    List ll = new LinkedList();

    System.out.println("순차적 추가");
    System.out.println("ArrayList :" + addSequentially(al));
    System.out.println("LinkedList :" + addSequentially(ll));
    System.out.println("중간에 추가");
    System.out.println("ArrayList :" + addMiddle(al));
    System.out.println("LinkedList :" + addMiddle(ll));
    System.out.println("중간 삭제");
    System.out.println("ArrayList :" + revomeMiddle(al));
    System.out.println("LinkedList :" + revomeMiddle(ll));
    System.out.println("순차적 삭제");
    System.out.println("ArrayList :" + removeSequentially(al));
    System.out.println("LinkedList :" +removeSequentially(ll));

  }

  private static long addMiddle(List list) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
      list.add(5000, i + "");
    }
    long end = System.currentTimeMillis();
    return end - start;
  }

  private static long addSequentially(List list) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < 1000000; i++) {
      list.add(i + "");
    }
    long end = System.currentTimeMillis();
    return end - start;
  }
  private static long removeSequentially(List<String>list){
    long start = System.currentTimeMillis();
    for (int i = list.size()-1; i >=0 ; i--) {
      list.remove(i); // index로 지움

    }
    long end = System.currentTimeMillis();
    return end-start;
  }

  private static long revomeMiddle(List<String> list){
    long start = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
      list.remove(i); // index로 지움
    }
    long end = System.currentTimeMillis();
    return end-start;
  }

}
