package a2.drink;


import a2.topping.Topping;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by melo45 on 2019-03-24.
 */
public class CokeTest {



  @Test
  public void TestAllGetAndSet() throws Exception {
    Coke coke = new Coke();
    coke.setName("coke");
    coke.setPrice(12);
    Assert.assertEquals(12,coke.getPrice(), 0.0);
    Assert.assertEquals("coke",coke.getName());

  }


}