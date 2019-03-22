package a2.Pizza;


import java.util.List;

public class Pepperoni implements Pizza {
  private List<String> toppings;
  private String size;
  private String name;
  private double price;
  public Pepperoni() {
    this.name = "Pepperoni";
    this.price = 3.5;
  }
  public void setPrice(int price) {
    this.price = price;
  }

  public double getPrice() {
    return this.price;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getSize() {
    return this.size;
  }

  public String getName() {
    return this.name;
  }
  public void addTopping(String topping, List<String> toppings) {
    toppings.add(topping);
  }

  public void preparation() {

  }

}
