package a2.order;

import a2.Pizza.Pizza;
import a2.drink.Drink;
import a2.topping.Topping;
import java.util.ArrayList;
import java.util.List;

public class OrderManager {

  private List<Order> orderList = new ArrayList<Order>();


  public void addOrderToList(Order order) {
    orderList.add(order);
  }

  public void cancelOrder(int id) {
    for (int i = 0; i < this.orderList.size(); i++) {
      if (this.orderList.get(i).getId() == id) {
        this.orderList.remove(i);
      }
    }

  }

  public List<Order> getOrderList() {
    return this.orderList;
  }

  public Order getOrder(int id) {
    for (Order anOrderList : this.orderList) {
      if (anOrderList.getId() == id) {
        return anOrderList;
      }
    }
    return null;
  }

  public void addOrderPizza(int id, Pizza pizza) {
    for (Order o : orderList) {
      if (o.getId() == id) {
        o.addPizza(pizza);
      }
    }
  }

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

  public void addOrderDrink(int id, Drink drink) {
    for (Order o : orderList) {
      if (o.getId() == id) {
        o.addDrink(drink);
      }
    }
  }

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

  public double getSepcificPrice(int id) {
    for (Order o : orderList) {
      if (o.getId() == id) {
        return o.calculatePrice();
      }
    }
    return 0.0;
  }


}
