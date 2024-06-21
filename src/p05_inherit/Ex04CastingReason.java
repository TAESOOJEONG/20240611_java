package p05_inherit;

public class Ex04CastingReason {
  public static void main(String[] args) {
    Buyer buyer = new Buyer();
    Laptop laptop = new Laptop();
    Tv tv = new Tv();
    Audio audio = new Audio();
  }
}

class Buyer {

  int money = 1000;

  void buy(Tv tv) {
    money -= tv.price;
  }

  void buy(Audio audio) {
    money -= audio.price;
  }

  void buy(Laptop laptop) {
    money -= laptop.price;
  }

  void buy(Product product) {
    money -= product.price;
  }
}

abstract class Product {
  int price;

  public Product(int price) {
    this.price = price;
  }

}

class Laptop extends Product {
  public Laptop() {
    super(300);
  }
}

class Tv extends Product {
  public Tv() {
    super(200);
  }
}

class Audio extends Product {
  public Audio() {
    super(500);
  }
}
