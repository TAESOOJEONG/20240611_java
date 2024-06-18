package P03_method;

public class Ex03ConstructorA {
  public static void main(String[] args) {
    Employee e2 = new Employee("정태수",123,"2024/05/10",28,"남자");
    System.out.println(e2.getEname());

    Employee e1 = new Employee();
    e1.setEname("정태수");
    e1.setEmpno(3510);
    e1.setHiredate("2024/05/10");
    e1.setAge(28);
    e1.setSex("남자");
    System.out.println(e1.getEname());
    System.out.println(e1.getEmpno());
    System.out.println(e1.getHiredate());
    System.out.println(e1.getAge());
    System.out.println(e1.getSex());
    }

}
class Employee{
  private String ename;
  private int empno;
  private String hiredate;
  private int age;
  private String sex;

  public Employee(){

  }

  public Employee(String ename,int empno, String hiredate, int age,String sex)
  {
    this.ename = ename;
    this.empno = empno;
    this.hiredate = hiredate;
    this.age = age;
    this.sex = sex;
  }
  public String getEname() {
    return ename;
  }

  public void setEname(String ename) {
    this.ename = ename;
  }

  public int getEmpno() {
    return empno;
  }

  public void setEmpno(int empno) {
    this.empno = empno;
  }

  public String getHiredate() {
    return hiredate;
  }

  public void setHiredate(String hiredate) {
    this.hiredate = hiredate;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }
}
