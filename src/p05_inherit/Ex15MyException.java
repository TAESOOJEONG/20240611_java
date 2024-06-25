package p05_inherit;
// 예외상황을 내가 커스터마이징 할 수 있다. ex 로그인익셉션 등
public class Ex15MyException {
  public static void main(String[] args) {
    try {
      // Exception 을 상속 받았기 때문에 throw 사용
      throw new MyException("내가 발생시킨 예외");
    } catch (MyException e) {
      System.out.println(e.getMessage());
    }
  }
}

class MyException extends Exception {
  public MyException(String message) {
    super(message);
  }
}