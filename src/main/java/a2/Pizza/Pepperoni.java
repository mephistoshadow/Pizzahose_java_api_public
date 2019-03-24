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

  public double getPrice() {
    return this.price;
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
  public List<Topping> getToppings() {
    return this.toppings;
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
