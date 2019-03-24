package a2.topping;

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
import org.junit.Before;
import org.junit.Test;

/**
 * Created by melo45 on 2019-03-24.
 */
public class ToppingFactoryTest {

  @Test
  public void TestAllMethod() throws Exception {
    ToppingFactory Topping = new ToppingFactory();
    assertTrue(Topping.getTopping("Beef") instanceof Beef);
    assertTrue(Topping.getTopping("Chicken") instanceof Chicken);
    assertTrue(Topping.getTopping("Jalapenos") instanceof Jalapenos);
    assertTrue(Topping.getTopping("Mushrooms") instanceof Mushroom);
    assertTrue(Topping.getTopping("Olives") instanceof Olives);
    assertTrue(Topping.getTopping("Pepperoni") instanceof Pepperoni);
    assertTrue(Topping.getTopping("Tomatoes") instanceof Tomatoes);


  }

}