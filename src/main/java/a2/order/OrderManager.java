package a2.order;

import a2.Pizza.Pizza;
import a2.drink.Drink;
import java.util.ArrayList;
import java.util.List;

public class OrderManager {

  private List<Order> orderList = new ArrayList<Order>();


  public void addOrderToList(Order order) {
    orderList.add(order);
  }

  public void cancelOrder(int id) {
    for (int i = 0; i < this.orderList.size(); i ++) {
      if (this.orderList.get(i).getId() == id) {
        this.orderList.remove(i);
      }
    }

  }

  public List<Order> getOrderList() {
    return this.orderList;
  }

  public void addOrderPizza(int id, Pizza pizza) {
    for (Order o : orderList) {
      if (o.getId() == id) {
        o.addPizza(pizza);
      }
    }
  }

  public void deleteOrderPizza(int id) {
    for (Order o : orderList) {
      if (o.getId() == id) {
        o.getPizza().clear();
      }
    }
  }

  public void addOrderDrink(int id, Drink drink) {
    for (Order o : orderList) {
      if (o.getId() == id) {
        o.addDrink(drink);
      }
    }
  }

  public void deleteOrderDrink(int id, Drink drink) {
    for (Order o : orderList) {
      if (o.getId() == id) {
        o.getDrinks().remove(drink);
      }
    }
  }


}
