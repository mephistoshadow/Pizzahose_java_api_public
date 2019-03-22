package a2.topping;

/**
 * Created by melo45 on 2019-03-22.
 */
public class ToppingFactory {
  public Topping getDrink (String name) {
    if (name.equalsIgnoreCase("olives")) {
      return new Olives();
    } else if (name.equalsIgnoreCase("tomatoes")) {
      return new Tomatoes();
    } else if (name.equalsIgnoreCase("mushrooms")) {
      return new Mushroom();
    } else if (name.equalsIgnoreCase("jalapenos")) {
      return new Jalapenos();
    }else if (name.equalsIgnoreCase("chicken")) {
      return new Chicken();
    }else if (name.equalsIgnoreCase("beef")) {
      return new Beef();
    }else if (name.equalsIgnoreCase("pepperoni")) {
      return new Pepperoni();
    }
    return null;
  }

}
