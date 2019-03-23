package a2.Pizza;
import a2.topping.Jalapenos;
import a2.topping.Topping;
import java.util.ArrayList;
import java.util.List;


public class Neapolitan extends Pizza{
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
    return price;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getSize() {
    return size;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
  public void addTopping(Topping topping) {
    this.toppings.add(topping);
  }
  @Override
  public void preparation() {
    Topping jalapenos = new Jalapenos();
    this.toppings.add(jalapenos);
  }
}
