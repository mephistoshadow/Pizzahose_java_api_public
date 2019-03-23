package a2.topping;


public class Olives implements Topping {

  private String name;
  private double price;

  public Olives() {
    this.name = "Olives";
    this.price = 1.9;
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
