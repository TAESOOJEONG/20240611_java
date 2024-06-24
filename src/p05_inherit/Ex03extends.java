package p05_inherit;

import javax.swing.*;

public class Ex03extends {
  public static void main(String[] args) {
    Marine m1 = new Marine();
    System.out.println(m1);
    Medic medic = new Medic();
    System.out.println(medic);

  }
}

abstract class Unit {
  public Unit() {
    //this(),super()는 반드시 생성자 첫 줄에 있어야함 -> 공존불가
    super();
    //this("",15,"");
    System.out.println("야생 동물 생성");

  }

  public Unit(String tribe, int hp, String name) {
    super();
    this.tribe = tribe;
    this.hp = hp;
    this.name = name;
  }

  String name;
  int hp;
  String tribe;

  public void move(int x, int y) {
  }

  public void stop() {
  }

  @Override
  public String toString() {
    return String.format("tribe=%s, name=%s, hp=%d", tribe, name, hp);
  }
}

// 추상 클래스는 스스로 인스턴스 생성 불가. 상속받은 후 인스턴스 생성 가능
abstract class Protoss extends Unit {
  // 상속할 경우에는 Member변수와 method만 상속
  public Protoss(String name, int hp) {
    super("Protoss", hp, name);
  }
}


abstract class Terran extends Unit {
  // 상속할 경우에는 Member변수와 method만 상속
  public Terran(String name, int hp) {
    super("Terran", hp, name);
  }
}

class Marine extends Terran {
  public Marine() {
    super("Marine", 40);
  }
}

class Medic extends Terran {
  public Medic() {
    super("Medic", 60);
  }
}