package a2.drink;

/**
 * Created by melo45 on 2019-03-22.
 */
public class DrinkFactory{
  public Drink getDrink (String name) {
    if (name.equalsIgnoreCase("Coke")) {
      return new Coke();
    } else if (name.equalsIgnoreCase("Diet Coke")) {
      return new DietCoke();
    } else if (name.equalsIgnoreCase("Coke Zero")) {
      return new CokeZero();
    } else if (name.equalsIgnoreCase("Pepsi")) {
      return new Pepsi();
    }else if (name.equalsIgnoreCase("Diet Pepsi")) {
      return new DietPepsi();
    }else if (name.equalsIgnoreCase("Dr. Pepper")) {
      return new DrPepper();
    }else if (name.equalsIgnoreCase("Water")) {
      return new Water();
    }else if (name.equalsIgnoreCase("Juice")) {
      return new Juice();
    }
    return null;
  }
}
