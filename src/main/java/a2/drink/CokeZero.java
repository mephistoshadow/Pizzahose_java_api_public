package a2.drink;


public class CokeZero implements Drink {

  private String name;
  private double price;

  public CokeZero() {
    this.name = "CokeZero";
    this.price = 1.2;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
