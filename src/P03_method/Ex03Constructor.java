package P03_method;

public class Ex03Constructor {
  public static void main(String[] args) {
    Car gv70 = new Car("gv", "white", "HD");
    gv70.setColor("white");
  }
}


class Car {
  // 생성자는 없어도 기본 생성자가 자동으로 생성된다.
  // 생성자는 new에 의해서 인스턴스 생성이 된다.
  // 생성자도 오버로딩이 된다.
  // 사용자가 생성자를 등록하면 기본 생성자는 자동 추가가 안된다.
  public Car() {
    this("gv80","white","hd");
  }

  public Car(String model, String color, String maker) {
    this.model = model;
    this.color = color;
    this.maker = maker;
  }

  private String model;
  private String color;
  private String maker;

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getMaker() {
    return maker;
  }

  public void setMaker(String maker) {
    this.maker = maker;
  }
}
