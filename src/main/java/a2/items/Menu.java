package a2.items;

import a2.Pizza.PizzaFactory;
import java.util.List;
import java.util.Iterator;
import a2.drink.Drink;
import a2.Pizza.*;

public class Menu {
    private List<Drink> Drinks;
    private List<Pizza> Pizzas;
    private List<String> topping;
    private String fullMenu;

    public Menu(String pizzaPrice, String drinkPrice, String toppingPrice){
        fullMenu=pizzaPrice+drinkPrice+toppingPrice;
        String[] pizzaS=pizzaPrice.split(",");
        PizzaFactory pizzaF = new PizzaFactory();

        for(String s : pizzaS) {
            String[] pizzaInfo=s.split(" ");
            Pizza p=pizzaF.getPizza(pizzaInfo[0]);
            p.setSize(pizzaInfo[1]);
            p.setPrice(Integer.parseInt(pizzaInfo[2]));
            Pizzas.add(p);


        }




    }


    public void changePrice(String item, float price){



    }

    public String getMenuPrice(){
        Iterator iterator = Pizzas.iterator();
        while(iterator.hasNext()) {
            Pizza pizza = (Pizza) iterator.next();
            fullMenu=pizza.getName()+ " " +pizza.getSize()+ " " +pizza.getPrice() +",\n";

        }

        Iterator iteratorD = Pizzas.iterator();
        while(iteratorD.hasNext()) {
            Drink drink = (Drink) iteratorD.next();
            fullMenu=fullMenu+drink.getName()+ " " +drink.getPrice() +",\n";

        }
        Iterator iteratTopping = topping.iterator();
        while(iteratTopping.hasNext()) {
            String top = (String) iteratTopping.next();
            fullMenu=top+",\n";

        }
        fullMenu+=topping;

        return "fullMenu";

    }
    public String getMenu(){
        return "price";

    }

    public static void main(String[] args) {

        System.out.println("Welcome to 301 Pizza!: ");
        

    }


}
