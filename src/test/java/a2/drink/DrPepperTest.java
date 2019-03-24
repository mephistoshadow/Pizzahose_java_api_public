package a2.drink;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by melo45 on 2019-03-24.
 */
public class DrPepperTest {

  @Test
  public void TestAllGetAndSet() throws Exception {
    DrPepper drink = new DrPepper();
    drink.setName("coke");
    drink.setPrice(12);
    Assert.assertEquals(12,drink.getPrice(), 0.0);
    Assert.assertEquals("coke",drink.getName());

  }
}