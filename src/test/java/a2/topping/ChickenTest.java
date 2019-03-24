package a2.topping;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by melo45 on 2019-03-24.
 */
public class ChickenTest {

  @Test
  public void TestAllMethod() throws Exception {
    Chicken drink = new Chicken();
    drink.setName("Beef");
    drink.setPrice(12);
    Assert.assertEquals(12,drink.getPrice(), 0.0);
    Assert.assertEquals("Beef",drink.getName());

  }


}