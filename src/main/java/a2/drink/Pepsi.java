package a2.drink;


public class Pepsi implements Drink {

  private String name;
  private double price;
  /**
   * the constructor for the sepcific drink.
   */
  public Pepsi() {
    this.name = "Pepsi";
    this.price = 1.2;
  }
  /**
   * to get the object's price.
   * @return the price of it.
   */
  public double getPrice() {
    return this.price;
  }

  /**
   * set the price of the drink
   * @param price the price we want to set.
   */
  public void setPrice(double price) {
    this.price = price;
  }

  /**
   * get the name of the drink.
   * @return the name of the drink.
   */
  public String getName() {
    return this.name;
  }

  /**
   * set the name of the drink.
   * @param name the name string.
   */
  public void setName(String name) {
    this.name = name;
  }

}
