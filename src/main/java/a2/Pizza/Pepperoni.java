package a2.Pizza;


import java.util.List;

public class Pepperoni implements Pizza {
  private List<String> toppings;
  private String size;
  private String name;
  private int price;

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
    return "pepperoni";
  }
  public void addTopping(String topping, List<String> toppings) {
    toppings.add(topping);
  }

  public void preparation() {

  }

}
