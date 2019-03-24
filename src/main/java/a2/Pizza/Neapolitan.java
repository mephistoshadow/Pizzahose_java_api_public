package a2.Pizza;

import a2.topping.Jalapenos;
import a2.topping.Topping;
import java.util.ArrayList;
import java.util.List;


public class Neapolitan extends Pizza {

  private List<Topping> toppings = new ArrayList<Topping>();
  private String size;
  private String name;
  private double price;

  public Neapolitan() {
    this.name = "Neapolitan";
    this.price = 21.3;
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
