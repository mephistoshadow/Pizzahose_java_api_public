package a2.drink;


public class DrinkFactory {

  /**
   * this is the method we create the instance for the sepcific type of drink.
   * @param name the name of the drink.
   * @return the drink object we want to create.
   */
  public Drink getDrink(String name) {
    if (name.equalsIgnoreCase("Coke")) {
      return new Coke();
    } else if (name.equalsIgnoreCase("Diet Coke")) {
      return new DietCoke();
    } else if (name.equalsIgnoreCase("Coke Zero")) {
      return new CokeZero();
    } else if (name.equalsIgnoreCase("Pepsi")) {
      return new Pepsi();
    } else if (name.equalsIgnoreCase("Diet Pepsi")) {
      return new DietPepsi();
    } else if (name.equalsIgnoreCase("Dr. Pepper")) {
      return new DrPepper();
    } else if (name.equalsIgnoreCase("Water")) {
      return new Water();
    } else if (name.equalsIgnoreCase("Juice")) {
      return new Juice();
    }
    return null;
  }

}
