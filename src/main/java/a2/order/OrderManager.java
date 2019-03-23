package a2.order;

import a2.Pizza.Pizza;
import a2.drink.Drink;
import com.sun.tools.corba.se.idl.constExpr.Or;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by melo45 on 2019-03-21.
 */
public class OrderManager {
  private List<Order> orderList = new ArrayList<Order>();


  public void addOrderToList(Order order) {
    orderList.add(order);
  }

  public void cancelOrder(int id) {
    for(Order o :orderList) {
      if(o.getId() == id) {
        this.orderList.remove(o);
      }
    }

  }
  public List<Order> getOrderList() {
    return this.orderList;
  }

  public void addOrderPizza(int id, Pizza pizza) {
    for(Order o :orderList) {
      if(o.getId() == id) {
        o.addPizza(pizza);
      }
    }
  }

  public void deleteOrderPizza(int id) {
    for(Order o :orderList) {
      if(o.getId() == id) {
        o.getPizza().clear();
      }
    }
  }

  public void addOrderDrink(int id, Drink drink) {
    for(Order o :orderList) {
      if(o.getId() == id) {
        o.addDrink(drink);
      }
    }
  }

  public void deleteOrderDrink(int id, Drink drink) {
    for(Order o :orderList) {
      if(o.getId() == id) {
        o.getDrinks().remove(drink);
      }
    }
  }



}
