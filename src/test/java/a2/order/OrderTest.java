package a2.order;

import static org.junit.Assert.*;

import a2.Pizza.Pepperoni;
import a2.drink.Coke;
import org.junit.Before;
import org.junit.Test;

public class OrderTest {
  @Test
  public void getAddPizza() throws Exception {
    Order order = new Order(1);
    Pepperoni pep = new Pepperoni();
    order.addPizza(pep);
    assertTrue(order.getPizza().get(0) instanceof  Pepperoni);
  }

  @Test
  public void getAddDrinks() throws Exception {
    Order order = new Order(1);
    Coke pep = new Coke();
    order.addDrink(pep);
    assertTrue(order.getDrinks().get(0) instanceof  Coke);
  }

  @Test
  public void calculatePrice() throws Exception {
    Order order = new Order(1);
    Coke pep = new Coke();
    order.addDrink(pep);
    Pepperoni pizza = new Pepperoni();
    order.addPizza(pizza);
    assertEquals(4.7,order.calculatePrice(),0.0);
  }

  @Test
  public void getId() throws Exception {
    Order order = new Order(1);
    assertEquals(1,order.getId());
  }

  @Test
  public void printPizzaAndTopping() throws Exception {
    Order order = new Order(1);
    Coke pep = new Coke();
    order.addDrink(pep);
    Pepperoni pizza = new Pepperoni();
    order.addPizza(pizza);

    assertEquals("Pepperoni\n"
        + "Toppings : \n"
        + "\n"
        + "Drinks : Coke ",order.printPizzaAndTopping());
  }

}