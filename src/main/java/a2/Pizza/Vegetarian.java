package a2.Pizza;

import a2.topping.Tomatoes;
import a2.topping.Topping;
import java.util.ArrayList;
import java.util.List;


public class Vegetarian extends Pizza {

  private List<Topping> toppings;
  private String size;
  private String name;
  private double price;

  Vegetarian() {
    this.name = "Vegetarian";
    this.price = 7.3;
    toppings = new ArrayList<Topping>();
  }

  public double getPrice() {
    return price;
  }
  public List<Topping> getToppings() {
    return this.toppings;
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

  public void setName(String name) {
    this.name = name;
  }

  public void addTopping(Topping topping) {
    this.toppings.add(topping);
  }

  @Override
  public void preparation() {
  }


}
