package a2.order;
import a2.Pizza.*;
import a2.topping.*;
import a2.drink.*;


import java.util.List;

public class Order {
  private int orderNumber;
  private List<Pizza> pizzas;
  private List<Drink> Drinks;
  public Order(int orderNumber) {
    this.orderNumber = orderNumber;
  }

  public List<Pizza> getPizza() {
   return this.pizzas;
  }
  public void addPizza(Pizza pizza) {
    pizzas.add(pizza);
  }
}
