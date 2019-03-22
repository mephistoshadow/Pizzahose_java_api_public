package a2.Pizza;

public class PizzaFactory{
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
