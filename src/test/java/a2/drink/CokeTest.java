package a2.drink;


import a2.topping.Topping;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.BeforeClass;

/**
 * Created by melo45 on 2019-03-24.
 */
public class CokeTest {

  private Drink coke;

  @Before
  public void onSetUp() throws Exception {

    coke.setName("coke");
    coke.setPrice(12.0);
  }

  @Test
  public void getPrice() throws Exception {
    Assert.assertEquals(12.0,coke.getPrice());

  }

  @Test
  public void setPrice() throws Exception {
  }

  @Test
  public void getName() throws Exception {
  }

  @Test
  public void setName() throws Exception {
  }

}