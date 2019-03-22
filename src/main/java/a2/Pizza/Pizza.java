package a2.Pizza;

import java.util.List;

/**
 * Created by melo45 on 2019-03-21.
 */
public interface Pizza {
  public void setPrice(int price);

  public double getPrice();

  public void setSize(String size);

  public String getSize();

  public String getName();

  public void addTopping(String topping, List<String> toppings);

  public void preparation();

}
