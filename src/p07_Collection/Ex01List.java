package p07_Collection;

import common.Utils;
import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

// Collection : 배열의 모든 원소(type)는 오브젝트 -> 모든 타입을 받아들일 수 있다.
//              가변형 사이즈
public class Ex01List {
  public static void main(String[] args) {
    // 순서 있다, 중복 된다.
    List list = new ArrayList();
    list.add(new Member("HGD", "1", "홍길동"));
    list.add(new Member("kGD", "1", "김길동"));
    list.add(new Member("jGD", "1", "정길동"));
    list.add(10);
    list.add(true);

    System.out.println(list);
    //1. for index
    for (int i =0;i<list.size();i++)   Utils.typeOf(i);

    //2. enhanced for
    for(Object o :list) Utils.typeOf(o);

    //3. foreach
    // 익명객체는 일회성, 참조할 일 없는 경우
    list.forEach(new Consumer() {
      @Override
      public void accept(Object o) {
        Utils.typeOf(o);
      }
    });

    // lambda -'>'
    list.forEach(o -> Utils.typeOf(o));
    System.out.println("===");

    // 클래스를 생성해야 하는 경우, 참조할 일 있을 때

    class ObjConsumer implements Consumer {
      String  lists = "";
      @Override
      public void accept(Object o) {
        lists += o;
        Utils.typeOf(o);
      }
    }
    ObjConsumer oc = new ObjConsumer();
    list.forEach(oc); //list.forEach(Consumer consumer);
    System.out.println(oc.lists);
    // list 지우기
        System.out.println(">>"+list.contains(10));
    list.addAll(new ArrayList((5)));
    System.out.println("listclear");
    list.clear();

    System.out.println(list);
    System.out.println(list.isEmpty());
    List linkedList = new LinkedList();


  }
}

class Member {
  private String id;
  private String pass;
  private String name;

  public Member(String id, String pass, String name) {
    this.id = id;
    this.pass = pass;
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("%s(ID: %s)", name, id);
  }
}