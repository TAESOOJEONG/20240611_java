package p09_Thread;
// Thread 를 1회 작동할 때 마다 해당 메서드를 확인한다.
// 그래서 음수가 될 때는 인출을 진행하지 않는다.
public class Ex02Synchronized {
  public static void main(String[] args) {
// Runnable 을 implement 하면 Thread()생성자 안에 매개변수로 전달해야만 가능

    Customer customer = new Customer();
    new Thread(customer).start();
    new Thread(customer).start();
  }
}

class Account {
  int balance = 1000;

  public int getBalance() {
    return balance;
  }

 synchronized public void withdraw(int money) {
    if (balance >= money) {
      try {
        Thread.sleep(300);

      } catch (Exception e) {
      }
      balance -= money;
    }
  }
}

class Customer implements Runnable {
  Account acc = new Account();

  @Override
  public void run() {
    while (acc.getBalance() > 0) {
      int money = (int) (Math.random() * 3 + 1) * 100;
      acc.withdraw(money);
      System.out.println("잔액 : " + acc.getBalance());
    }
  }
}