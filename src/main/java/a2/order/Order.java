package a2.order;

import a2.Pizza.Pizza;
import a2.drink.Drink;
import a2.topping.Topping;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {

  private int orderNumber;
  private List<Pizza> pizzas = new ArrayList<Pizza>();
  private List<Drink> drinks = new ArrayList<Drink>();

  /**
   * this is the constructor for order, we take in the id for it.
   * @param orderNumber the order id.
   */
  public Order(int orderNumber) {
    this.orderNumber = orderNumber;
  }

  /**
   * get the pizza list for the order.
   * @return the list of pizza for order.
   */
  public List<Pizza> getPizza() {
    return this.pizzas;
  }

  /**
   * add the pizza to the order.
   * @param pizza this is the pizza when user want to add.
   */
  public void addPizza(Pizza pizza) {
    pizzas.add(pizza);
  }

  /**
   * return the drink list for the order.
   * @return the drink list.
   */
  public List<Drink> getDrinks() {
    return this.drinks;
  }

  /**
   * we calculate the price of topping drinnk and pizza and add together.
   * @return the total price for the order.
   */
  public double calculatePrice() {
    double price = 0;
    for (Pizza o : this.pizzas) {
      price = price + o.getPrice();
      for (Topping t : o.getToppings()) {
        price = price + t.getPrice();
      }
    }
    for (Drink d : this.drinks) {
      price = price + d.getPrice();
    }
    return price;
  }

  /**
   * this function add the drink to the order.
   * @param drink this is drink we want to add.
   */
  public void addDrink(Drink drink) {
    drinks.add(drink);
  }

  /**
   * This function return the order's id.
   * @return the order id.
   */
  public int getId() {
    return this.orderNumber;
  }

  /**
   * this function is used to print the pizza information.
   * @return the pizza information string.
   */
  public String printPizzaAndTopping() {
    String printPandT = "";
    for (Pizza o : this.pizzas) {
      printPandT = printPandT + o.getName() + '\n' + "Toppings : ";
      for(Topping t : o.getToppings()) {
        printPandT = printPandT + t.getName() + " ";
      }
      printPandT = printPandT + '\n';
    }
    printPandT = printPandT + '\n' + "Drinks : ";
    String printD = "";
    for (Drink o : this.drinks) {
      printD = printD + o.getName() + " ";
    }
    printPandT = printPandT + printD;
    return printPandT;
  }






}
