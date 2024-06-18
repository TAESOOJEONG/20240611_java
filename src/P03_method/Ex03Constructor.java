package P03_method;

public class Ex03Constructor {
  public static void main(String[] args) {
    Car gv70 = new Car();
    gv70.setColor("white");
  }
}


class Car {
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
