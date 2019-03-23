package a2.Pizza;
import a2.topping.Topping;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by melo45 on 2019-03-22.
 */
public class Neapolitan implements Pizza{
  private List<Topping> toppings = new ArrayList<Topping>();
  private String size;
  private String name;
  private double price;
  public Neapolitan() {
    this.name = "Neapolitan";
    this.price = 21.3;
  }
  public void setPrice(double price) {
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
  public void addTopping(Topping topping) {
    this.toppings.add(topping);
  }

  public void preparation() {

  }
}
