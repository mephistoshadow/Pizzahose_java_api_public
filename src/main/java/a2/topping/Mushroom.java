package a2.topping;

/**
 * Created by melo45 on 2019-03-22.
 */
public class Mushroom implements Topping{
  private String name;
  private double price;

  public Mushroom(){
    this.name = "Mushroom";
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