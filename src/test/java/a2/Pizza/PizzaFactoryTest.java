package a2.Pizza;

import static org.junit.Assert.*;

import a2.drink.Coke;
import a2.drink.CokeZero;
import a2.drink.DietCoke;
import a2.drink.DietPepsi;
import a2.drink.DrPepper;
import a2.drink.DrinkFactory;
import a2.drink.Juice;
import a2.drink.Pepsi;
import a2.drink.Water;
import org.junit.Test;

/**
 * Created by melo45 on 2019-03-24.
 */
public class PizzaFactoryTest {

  @Test
  public void TestAllMethod() throws Exception {
    PizzaFactory pizza = new PizzaFactory();
    assertTrue(pizza.getPizza("Margherita") instanceof Margherita);
    assertTrue(pizza.getPizza("Neapolitan") instanceof Neapolitan);
    assertTrue(pizza.getPizza("Pepperoni") instanceof Pepperoni);
    assertTrue(pizza.getPizza("Vegetarian") instanceof Vegetarian);


  }
}