package a2.Pizza;

import a2.topping.Chicken;
import a2.topping.Topping;
import java.util.ArrayList;
import java.util.List;


public class Margherita extends Pizza {

  private List<Topping> toppings = new ArrayList<Topping>();
  private String size;
  private String name;
  private double price;

  public Margherita() {
    this.name = "margherita";
    this.price = 2.3;
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

  public void setName(String name) {
    this.name = name;
  }

  public void addTopping(Topping topping) {
    this.toppings.add(topping);
  }

  @Override
  public void preparation() {
    Topping chicken = new Chicken();
    this.toppings.add(chicken);
  }
}
