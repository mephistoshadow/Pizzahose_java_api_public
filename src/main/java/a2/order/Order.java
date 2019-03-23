package a2.order;
import a2.Pizza.*;
import a2.topping.*;
import a2.drink.*;


import java.util.ArrayList;
import java.util.List;

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
  public void addDrink(Drink drink) {
    drinks.add(drink);
  }

  public int getId() {
    return this.orderNumber;
  }


}
