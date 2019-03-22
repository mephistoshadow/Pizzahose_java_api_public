package a2.Pizza;
import a2.topping.Topping;
import java.util.List;

/**
 * Created by melo45 on 2019-03-22.
 */
public class Margherita implements Pizza {
  private List<String> toppings;
  private String size;
  private String name;
  private double price;
  public Margherita() {
      this.name = "margherita";
      this.price = 2.3;
    }
  public void setPrice(int price) {
    this.price = price;
  }

  public double getPrice() {
    return this.price;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getSize() {
    return this.size;
  }

  public String getName() {
    return this.name;
  }
  public void addTopping(Topping topping, List<Topping> toppings) {
    toppings.add(topping);
  }

  public void preparation() {

  }
}
