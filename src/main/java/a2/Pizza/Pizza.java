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

  /**
   * get the price for it.
   * @return the price.
   */
  public double getPrice() {
    return price;
  }

  /**
   * get the topping list.
   * @return the list of topping.
   */
  public List<Topping> getToppings() {
    return this.toppings;
  }

  /**
   * set the price for the pizza.
   * @param price the price of pizza.
   */
  public void setPrice(double price) {
    this.price = price;
  }

  /**
   * get the size for the pizza.
   * @return the pizza's size.
   */
  public String getSize() {
    return size;
  }

  /**
   * set the size for the pizza.
   * @param size the size of the pizza.
   */
  public void setSize(String size) {
    this.size = size;
  }

  /**
   * get the name of the pizza.
   * @return the name.
   */
  public String getName() {
    return name;
  }

  /**
   * set name.
   * @param name the name of pizza.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * add the topping to it.
   * @param topping the topping we want.
   */
  public void addTopping(Topping topping) {
    this.toppings.add(topping);
  }

  /**
   * the sepcific method for prepare.
   */

  public void preparation() {
  }

}
