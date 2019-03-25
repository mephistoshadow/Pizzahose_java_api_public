package a2.order;

import a2.Pizza.Pizza;
import a2.drink.Drink;
import a2.topping.Topping;
import java.util.ArrayList;
import java.util.List;

public class OrderManager {

  private List<Order> orderList = new ArrayList<Order>();


  /**
   * this is we add the order to the order list.
   * @param order the order we want to add.
   */
  public void addOrderToList(Order order) {
    orderList.add(order);
  }

  /**
   * we get the sepcific order from order list, and remove it to cancel.
   * @param id the id of the order.
   */
  public void cancelOrder(int id) {
    for (int i = 0; i < this.orderList.size(); i++) {
      if (this.orderList.get(i).getId() == id) {
        this.orderList.remove(i);
      }
    }

  }

  /**
   * we return the whole orders into a list.
   * @return the list of the orders.
   */
  public List<Order> getOrderList() {
    return this.orderList;
  }

  /**
   * get one perticular order using id.
   * @param id the order's id.
   * @return the order obejct.
   */
  public Order getOrder(int id) {
    for (Order anOrderList : this.orderList) {
      if (anOrderList.getId() == id) {
        return anOrderList;
      }
    }
    return null;
  }

  /**
   * add one pizza for perticular order.
   * @param id the order id.
   * @param pizza the pizza we want to add.
   */
  public void addOrderPizza(int id, Pizza pizza) {
    for (Order o : orderList) {
      if (o.getId() == id) {
        o.addPizza(pizza);
      }
    }
  }

  /**
   * delete the order's pizza.
   * @param id the order's id.
   * @param pizza the pizza name, we want to delete.
   */
  public void deleteOrderPizza(int id,String pizza) {
    for (Order o : orderList) {
      if (o.getId() == id) {
        for (int i = 0; i < o.getPizza().size(); i++) {
          if (o.getPizza().get(i).getName().equalsIgnoreCase(pizza)) {
            o.getPizza().remove(i);
            break;
          }

        }
      }
    }
  }

  /**
   * we add one drink to the order.
   * @param id the order's id.
   * @param drink the drinks.
   */
  public void addOrderDrink(int id, Drink drink) {
    for (Order o : orderList) {
      if (o.getId() == id) {
        o.addDrink(drink);
      }
    }
  }

  /**
   * delete drink from the order.
   * @param id the order's id.
   * @param drink the drink we want to delete.
   */
  public void deleteOrderDrink(int id, String drink) {
    for (Order o : orderList) {
      if (o.getId() == id) {
        for (int i = 0; i < o.getDrinks().size(); i++) {
          if (o.getDrinks().get(i).getName().equalsIgnoreCase(drink)) {
              o.getDrinks().remove(i);
            break;
          }

        }
      }
    }
  }

  /**
   * add the topping for particular order's perticular pizza.
   * @param id the order's id.
   * @param pizza the pizza.
   * @param topping the topping we want to add.
   */
  public void addOrderTopping(int id, String pizza,Topping topping) {
    for (Order o : orderList) {
      if (o.getId() == id) {
        for (int i = 0; i < o.getPizza().size(); i++) {
          if (o.getPizza().get(i).getName().equalsIgnoreCase(pizza)) {
            o.getPizza().get(i).addTopping(topping);
            break;
          }

        }
      }
    }
  }

  /**
   * delete the topping from the order's pizzza.
   * @param id the order's id.
   * @param pizza the pizza we want to add.
   * @param topping the topping we want to delete.
   */
  public void deleteOrderTopping(int id, String pizza,String topping) {
    for (Order o : orderList) {
      if (o.getId() == id) {
        for (int i = 0; i < o.getPizza().size(); i++) {
          if (o.getPizza().get(i).getName().equalsIgnoreCase(pizza)) {
            for(int j = 0; j < o.getPizza().get(i).getToppings().size(); j ++) {
              if(o.getPizza().get(i).getToppings().get(j).getName().equalsIgnoreCase(topping)) {
                o.getPizza().get(i).getToppings().remove(j);
                break;
              }
            }
            break;
          }

        }
      }
    }
  }

  /**
   * get the price for one order.
   * @param id the id of the order.
   * @return the price of that order.
   */
  public double getSepcificPrice(int id) {
    for (Order o : orderList) {
      if (o.getId() == id) {
        return o.calculatePrice();
      }
    }
    return 0.0;
  }


}
