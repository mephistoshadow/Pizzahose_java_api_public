package a2.Pizza;

import java.util.List;

/**
 * Created by melo45 on 2019-03-21.
 */
public interface Pizza {
  void setPrice(int price);

  double getPrice();

  void setSize(String size);

  String getSize();

  String getName();

  void addTopping(String topping, List<String> toppings);

  void preparation();

}
