package a2.Pizza;

import a2.topping.Topping;
import java.util.List;

/**
 * Created by melo45 on 2019-03-21.
 */
public interface Pizza {
  void setPrice(double price);

  double getPrice();

  void setSize(String size);

  String getSize();

  String getName();

  void addTopping(Topping topping, List<Topping> toppings);

  void preparation();

}
