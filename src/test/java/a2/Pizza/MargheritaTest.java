package a2.Pizza;

import static org.junit.Assert.*;


import a2.topping.Beef;
import a2.topping.Topping;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by melo45 on 2019-03-24.
 */
public class MargheritaTest {
  @Test
  public void TestAllGetAndSet() throws Exception {
    Margherita pizza = new Margherita();
    Beef beef = new Beef();
    pizza.setName("Margherita");
    pizza.setPrice(12);
    pizza.setSize("large");
    pizza.addTopping(beef);
    pizza.preparation();
    Assert.assertEquals(12,pizza.getPrice(), 0.0);
    Assert.assertEquals("Margherita",pizza.getName());
    Assert.assertEquals("large",pizza.getSize());
    Assert.assertTrue(pizza.getToppings().get(0) instanceof Beef);

  }

}