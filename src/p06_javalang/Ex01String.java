package p06_javalang;

import common.Utils;

import java.util.StringJoiner;

public class Ex01String {
  public static void main(String[] args) {
    String str1 = "hello";
    String str2 = new String("hello");
    String str3 = "hello";
    String str4 = String.valueOf("hello");


    // 문자열을 비교할 때는 equals 로 비교한다. ※ == 사용 x
    System.out.println(str1 == str2);
    System.out.println(str1 == str3);
    System.out.println(str1 == str4);
    System.out.println(str1.hashCode());
    System.out.println(str2.hashCode());
    System.out.println(str3.hashCode());
    System.out.println(System.identityHashCode(str1));
    System.out.println(System.identityHashCode(str2));
    System.out.println(System.identityHashCode(str3));
    System.out.println(str1.equals(str2));
    // constant pool 에 str1의 변수가 가리키는 "hello"를 가져옴.
    System.out.println("str1.intern() : " + str1.intern());
    for (int i = 0; i < str1.length(); i++) {
      if(i!=0) System.out.print(",");
      System.out.print(str1.charAt(i));
    }
    System.out.println();
    // H - W == -15
    System.out.println(str1.compareTo("world"));
    System.out.println(str1.concat(" world"));
    // hello 안에 hell 포함
    System.out.println(str1.contains("hell"));
    // h로 시작되는지
    System.out.println(str1.startsWith("hell"));
    // lo로 끝나는지
    System.out.println(str1.endsWith("lo"));
    // ll 이 시작되는 index 값
    System.out.println(str1.indexOf("ll"));
    // 마지막 l 이 시작되는 index 값
    System.out.println(str1.lastIndexOf("l"));
    //
    System.out.println(str1.indexOf("l",3));
    // l을 k로 바꿈
    System.out.println(str1.replace("l","k"));
    // o 를 없앰
    System.out.println(str1.replace("o",""));
    // split 을 이용하여 " " 공백이 있을때 ,로 분리
    String[] arr = "Passion is genesis of genus".split(" ");
    // System.out.println(Arrays.toString(arr));
    String fileName = "abc.index.html";
    System.out.println(fileName.substring(fileName.lastIndexOf(".")+1));
    System.out.println(fileName.substring(fileName.indexOf(".")+1,(fileName.lastIndexOf("."))));
    //
    System.out.println("Hello world".toLowerCase());
    System.out.println("Hello world".toUpperCase());
    // 좌 우 공백삭제
    System.out.println("   Hello world   ".trim());
    // 2진수 -> 10진수
    System.out.println(String.valueOf(0b100));
    System.out.println(String.valueOf(00100));
    System.out.println(String.valueOf(0xa0));
    StringJoiner sj = new StringJoiner(" ","※","\"");
    for (String s : arr){
      sj.add(s);
    }
    System.out.println(sj.toString());

  }
}