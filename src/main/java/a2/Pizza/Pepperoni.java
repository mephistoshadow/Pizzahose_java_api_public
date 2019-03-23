package a2.Pizza;


import a2.topping.Mushroom;
import a2.topping.Topping;
import java.util.ArrayList;
import java.util.List;

public class Pepperoni extends Pizza {
  private List<Topping> toppings;
  private String size;
  private String name;
  private double price;
  Pepperoni() {
    this.name = "Pepperoni";
    this.price = 3.5;
    toppings = new ArrayList<Topping>();
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

  @Override
  public void preparation() {
    Topping mushrooms = new Mushroom();
    this.toppings.add(mushrooms);
  }

}
