package a2.topping;


public class Pepperoni implements Topping{
  private String name;
  private double price;

  public Pepperoni(){
    this.name = "Pepperoni";
    this.price = 0.6;
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
