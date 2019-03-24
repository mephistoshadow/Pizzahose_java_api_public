package a2.drink;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by melo45 on 2019-03-24.
 */
public class DrinkFactoryTest {

  @Test
  public void TestAllMethod() throws Exception {
    DrinkFactory drinkF = new DrinkFactory();
    assertTrue(drinkF.getDrink("coke") instanceof Coke);
    assertTrue(drinkF.getDrink("Diet Coke") instanceof DietCoke);
    assertTrue(drinkF.getDrink("Coke Zero") instanceof CokeZero);
    assertTrue(drinkF.getDrink("Pepsi") instanceof Pepsi);
    assertTrue(drinkF.getDrink("Diet Pepsi") instanceof DietPepsi);
    assertTrue(drinkF.getDrink("Dr. Pepper") instanceof DrPepper);
    assertTrue(drinkF.getDrink("Water") instanceof Water);
    assertTrue(drinkF.getDrink("Juice") instanceof Juice);

  }

}