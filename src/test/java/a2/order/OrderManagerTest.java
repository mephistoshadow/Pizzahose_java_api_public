package a2.order;

import static org.junit.Assert.*;

import a2.Pizza.Pepperoni;
import a2.drink.Coke;
import a2.topping.Beef;
import a2.topping.Topping;
import org.apache.commons.lang3.ObjectUtils.Null;
import org.junit.Test;
import sun.invoke.empty.Empty;

/**
 * Created by melo45 on 2019-03-24.
 */
public class OrderManagerTest {
  @Test
  public void addOrderAndGetToList() throws Exception {
    OrderManager orderM = new OrderManager();
    Order order = new Order(0);
    Pepperoni pizza = new Pepperoni();
    order.addPizza(pizza);
    Coke coke = new Coke();
    order.addDrink(coke);
    orderM.addOrderToList(order);
    Beef beef = new Beef();
    order.getPizza().get(0).addTopping(beef);
    assertTrue(orderM.getOrder(0).equals(order));
  }

  @Test
  public void cancelOrder() throws Exception {
    OrderManager orderM = new OrderManager();
    Order order = new Order(0);
    Pepperoni pizza = new Pepperoni();
    order.addPizza(pizza);
    Coke coke = new Coke();
    order.addDrink(coke);
    orderM.addOrderToList(order);
    Beef beef = new Beef();
    order.getPizza().get(0).addTopping(beef);
    orderM.cancelOrder(0);

    assertTrue(orderM.getOrderList().size() == 0);
  }

  @Test
  public void getOrderList() throws Exception {
    OrderManager orderM = new OrderManager();
    Order order = new Order(0);
    Pepperoni pizza = new Pepperoni();
    order.addPizza(pizza);
    Coke coke = new Coke();
    order.addDrink(coke);
    orderM.addOrderToList(order);
    Beef beef = new Beef();
    order.getPizza().get(0).addTopping(beef);

    assertTrue(orderM.getOrderList().size() == 1);
    assertTrue(orderM.getOrderList().get(0).equals(order));
  }

  @Test
  public void addOrderPizza() throws Exception {
    OrderManager orderM = new OrderManager();
    Order order = new Order(0);
    Pepperoni pizza = new Pepperoni();
    Coke coke = new Coke();
    order.addDrink(coke);
    orderM.addOrderToList(order);
    Beef beef = new Beef();
    orderM.addOrderPizza(0,pizza);
    assertTrue(orderM.getOrderList().get(0).getPizza().get(0) instanceof Pepperoni);
  }

  @Test
  public void deleteOrderPizza() throws Exception {
    OrderManager orderM = new OrderManager();
    Order order = new Order(0);
    Pepperoni pizza = new Pepperoni();
    Coke coke = new Coke();
    order.addDrink(coke);
    orderM.addOrderToList(order);
    Beef beef = new Beef();
    orderM.addOrderPizza(0,pizza);
    orderM.deleteOrderPizza(0,"pepperoni");
    assertTrue(orderM.getOrderList().get(0).getPizza().size() == 0);
  }

  @Test
  public void addOrderDrink() throws Exception {
    OrderManager orderM = new OrderManager();
    Order order = new Order(0);
    Pepperoni pizza = new Pepperoni();
    Coke coke = new Coke();
    orderM.addOrderToList(order);
    Beef beef = new Beef();
    orderM.addOrderDrink(0,coke);
    assertTrue(orderM.getOrderList().get(0).getDrinks().get(0) instanceof Coke);
  }

  @Test
  public void deleteOrderDrink() throws Exception {
    OrderManager orderM = new OrderManager();
    Order order = new Order(0);
    Pepperoni pizza = new Pepperoni();
    Coke coke = new Coke();
    orderM.addOrderToList(order);
    Beef beef = new Beef();
    orderM.addOrderDrink(0,coke);
    orderM.deleteOrderDrink(0,"coke");
    assertTrue(orderM.getOrderList().get(0).getDrinks().size()==0);
  }

  @Test
  public void addOrderTopping() throws Exception {
    OrderManager orderM = new OrderManager();
    Order order = new Order(0);
    Pepperoni pizza = new Pepperoni();
    order.addPizza(pizza);
    Coke coke = new Coke();
    order.addDrink(coke);
    orderM.addOrderToList(order);
    Beef beef = new Beef();
    orderM.addOrderTopping(0,"pepperoni",beef);
    assertTrue(orderM.getOrderList().get(0).getPizza().get(0).getToppings().get(0) instanceof Beef);

  }

  @Test
  public void deleteOrderTopping() throws Exception {
    OrderManager orderM = new OrderManager();
    Order order = new Order(0);
    Pepperoni pizza = new Pepperoni();
    order.addPizza(pizza);
    Coke coke = new Coke();
    order.addDrink(coke);
    orderM.addOrderToList(order);
    Beef beef = new Beef();
    orderM.addOrderTopping(0,"pepperoni",beef);
    orderM.deleteOrderTopping(0,"pepperoni","beef");
    assertTrue(orderM.getOrderList().get(0).getPizza().get(0).getToppings().size() == 0);

  }

  @Test
  public void getSepcificPrice() throws Exception {
    OrderManager orderM = new OrderManager();
    Order order = new Order(0);
    Pepperoni pizza = new Pepperoni();
    order.addPizza(pizza);
    Coke coke = new Coke();
    order.addDrink(coke);
    orderM.addOrderToList(order);
    Beef beef = new Beef();
    order.getPizza().get(0).addTopping(beef);
    orderM.getSepcificPrice(0);
    assertEquals(4.9,orderM.getSepcificPrice(0),0.0);
  }

}