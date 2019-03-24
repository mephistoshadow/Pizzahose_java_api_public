package a2.Pizza;

import a2.topping.Beef;
import a2.topping.Topping;
import java.util.ArrayList;
import java.util.List;


public class Pizza {

  private List<Topping> toppings = new ArrayList<Topping>();
  private String size;
  private String name;
  private double price;

  public Pizza(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public Pizza() {
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getName() {
    return name;
  }
  public List<Topping> getToppings() {
    return this.toppings;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addTopping(Topping topping) {
    this.toppings.add(topping);
  }

  public void preparation() {
  }

}
