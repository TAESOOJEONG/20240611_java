package P03_method;

public class Ex02GetterSetter {
  public static void main(String[] args) {
    Person p1 = new Person();
    /*p1.id = "admin";
    p1.pass = "1234";
    p1.pass = "1111";*/
    System.out.println(p1.getName());

  }
}

class Person {
  // 속성에 private을 붙이면 외부에서 접근 불가
  private String name;
  private String id;
  private String pass;
  private String mobile;

  public String getName() {
    return name;
  }
  public String getId() {
    return id;
  }
  public String getPass() {
    return pass;
  }
  public String getMobile() {
    return mobile;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }



}

