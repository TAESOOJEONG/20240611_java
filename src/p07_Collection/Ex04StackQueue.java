package p07_Collection;

import java.util.*;

public class Ex04StackQueue {
  public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(0);
    stack.push(1);
    stack.push(2);
    System.out.println(stack);
    // stack 길이
    System.out.println(stack.size());
    // 1이 있는지 없는지 true / false
    System.out.println(stack.contains(1));
    // 마지막에 추가한 메서드 빼기(지우기)
    System.out.println(stack.pop());
    System.out.println(stack);
    // 마지막 메서드 확인하기 :: 사이즈 영향x
    System.out.println(stack.peek());
    System.out.println(stack);
    System.out.println(stack.empty());

    Queue q = new LinkedList();
    q.offer("a");
    q.offer("b");
    q.offer("c");
    System.out.println(q);
    // 먼저 들어온 것 먼저 빼기
    System.out.println(q.poll());
    System.out.println(q.peek());
    System.out.println(q);

    // collection 이전에 나온 버전 (동기화 포함)
    // Vector 단점 동기화가 되지않음
    Vector v = new Vector();
    v.add(0);
    v.add("a");
    v.add("sadasdsa");
    v.add(true);
    System.out.println(v);
    Enumeration e = v.elements();
    while (e.hasMoreElements()) {
      System.out.println(e.nextElement());
    }
    e = v.elements(); // 다시 사용하려고 할 때

    Iterator it = v.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());


    }
    it = v.iterator(); // 다시 사용하려고 할 때
  }
}
