package a2.drink;

/**
 * Created by melo45 on 2019-03-22.
 */
public class Water implements Drink{
  private String name;
  private double price;

  public Water(){
    this.name = "Water";
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