package a2.Pizza;

public class PizzaFactory {

  /**
   * giving a name and return an instance of pizza.
   * @param name the name we want to add.
   * @return the pizza object.
   */
  public Pizza getPizza(String name) {
    if (name.equalsIgnoreCase("pepperoni")) {
      return new Pepperoni();
    } else if (name.equalsIgnoreCase("margherita")) {
      return new Margherita();
    } else if (name.equalsIgnoreCase("Vegetarian")) {
      return new Vegetarian();
    } else if (name.equalsIgnoreCase("Neapolitan")) {
      return new Neapolitan();
    }
    return null;
  }
}
