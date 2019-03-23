package a2.topping;

public class Tomatoes implements Topping {

  private String name;
  private double price;

  public Tomatoes() {
    this.name = "Tomatoes";
    this.price = 0.2;
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
