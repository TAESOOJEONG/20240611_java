package P03_method;

public class Ex04CallByValue {
  public static void main(String[] args) {
    String st; // 선언만 할 경우 참조형 변수의 구조만 설정됨
    // System.out.println(st); // 초기화가 안되어서 에러
    String str = "hello";
    System.out.println(str);
    Data data = new Data();
    System.out.println("main: "+data);
    data.value = 100;System.out.println(data.value);
    change(500);        // 값을 호출 -> int value
    System.out.println();
    change(data.value); // 값을 호출 -> int value
    change(data);       // 주소값 호출 -> Data data
    System.out.println(data.value);


  }

  static void change(int value) {
    value = 1000;
    System.out.println("int의 value값  :" + value);
  }

  static void change(Data data) {
    data.value = 1000;
    System.out.println("change:"+data);
  }
}

class Data {
  int value;
}
