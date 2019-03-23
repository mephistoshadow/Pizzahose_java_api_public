package a2.Pizza;

import a2.topping.Beef;
import a2.topping.Tomatoes;
import a2.topping.Topping;
import java.util.ArrayList;
import java.util.List;


public class Pizza {
  private List<Topping> toppings = new ArrayList<Topping>();
  private String size;
  private String name;
  private double price;

  public Pizza(String name, double price, List<String>toppings){
    this.name = name;
    this.price = price;
  }
  public Pizza(){
  }
  public void setPrice(double price) {
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getSize() {
    return size;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
  public void addTopping(Topping topping) {
    this.toppings.add(topping);
  }

  public void preparation() {

  }

}
