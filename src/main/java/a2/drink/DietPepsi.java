package a2.drink;


public class DietPepsi implements Drink{
  private String name;
  private double price;

  public DietPepsi(){
    this.name = "DietPepsi";
    this.price = 1.2;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
