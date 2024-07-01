package p10_Thread;

import javax.swing.*;

public class Ex01Thread {
  public static void main(String[] args) {
  // Thread를 상속받으면 아래처럼 바로 start() 를 할 수 있다.
    // implement 는 Ex07에서

    Bomb bomb = new Bomb();
    bomb.start();
    int input = Integer.parseInt(JOptionPane.showInputDialog(
        "빨간선(0), 파란선(1) 중에 선택 하세요."));
    bomb.choice(input);
  }

}

// Thread 의 장점 : 별도의 흐름을 생성, 자원을 절약 할 수 있다.
// Thread 를 생성하는 방법
// 1) Thread 를 상속 , 2)Runnable 을 implement 한다.
class Bomb extends Thread {
  int answer = (int) (Math.random() * 2);
  private boolean stats;

  public void choice(int input ) {
    stats = true;
    if (answer == input) {
      System.out.println("답은 " + answer + " 살았다.");
    } else {
      System.out.println("답은 " + answer + " 죽었다.");
    }
  }

  @Override // Thread 의 동작을 정의한 메서드
  public void run() {
    for (int i = 10; i >= 0; i--) {
      if (stats == true) {
        break;
      }
      System.out.println(i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    System.out.println("시간이 다 지나서 터졌습니다.");
    System.exit(-1);
  }
}