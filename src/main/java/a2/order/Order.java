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

  public Order(int orderNumber) {
    this.orderNumber = orderNumber;
  }

  public List<Pizza> getPizza() {
    return this.pizzas;
  }

  public void addPizza(Pizza pizza) {
    pizzas.add(pizza);
  }

  public List<Drink> getDrinks() {
    return this.drinks;
  }
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

  public void addDrink(Drink drink) {
    drinks.add(drink);
  }

  public int getId() {
    return this.orderNumber;
  }

  public HashMap<String,List<String>> printPizzaAndTopping() {
    HashMap<String,List<String>> pizza = new HashMap<String, List<String>>();
    for (Pizza o : this.pizzas) {
      List <String> printT = new ArrayList<String>();
      for(Topping t : o.getToppings()) {
        printT.add(t.getName());
      }
      pizza.put(o.getName(),printT);
    }
    return pizza;
  }

  public List<String> printDrink() {
    List<String> printD = new ArrayList<String>();
    for (Drink o : this.drinks) {
      printD.add(o.getName());
    }
    return printD;
  }




}
