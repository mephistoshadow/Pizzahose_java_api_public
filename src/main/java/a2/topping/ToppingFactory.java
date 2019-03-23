package a2.topping;


public class ToppingFactory {
  public Topping getTopping (String name) {
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
