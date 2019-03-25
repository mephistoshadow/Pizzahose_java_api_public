package a2.topping;


public class Pepperoni implements Topping {

  private String name;
  private double price;

  public Pepperoni() {
    this.name = "Pepperoni";
    this.price = 0.6;
  }

  /**
   * get the price for this topping.
   * @return the price.
   */
  public double getPrice() {
    return this.price;
  }

  /**
   * set the price for this topping.
   * @param price the price of the topping.
   */
  public void setPrice(double price) {
    this.price = price;
  }

  /**
   * get the name of the topping.
   * @return the name of the topping.
   */
  public String getName() {
    return this.name;
  }

  /**
   * set the name of the topping.
   * @param name name we want to set.
   */
  public void setName(String name) {
    this.name = name;
  }

}
