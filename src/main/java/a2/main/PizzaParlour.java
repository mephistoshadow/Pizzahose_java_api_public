package a2.main;
import a2.Pizza.Pizza;
import a2.Pizza.PizzaFactory;
import a2.drink.Drink;
import a2.drink.DrinkFactory;
import a2.order.Order;
import a2.topping.Topping;
import a2.topping.ToppingFactory;
import java.util.Scanner;
import a2.*;

public class PizzaParlour {

    public static void main(String[] args) {

        System.out.println("Welcome to 301 Pizza!: ");
        PizzaFactory p = new PizzaFactory();
        DrinkFactory d = new DrinkFactory();
        ToppingFactory t= new ToppingFactory();


        Scanner scanner = new Scanner(System.in);
        while(true) {
            String options = scanner.nextLine();
            if(options.equals("new")) {
                Order a = new Order(1);
                String pizza = scanner.nextLine();
                Pizza c = p.getPizza(pizza);
                System.out.println("succs add pizza");
                String topping = scanner.nextLine();
                c.addTopping(t.getTopping(topping));
              System.out.println("succs add topping");
                String drink = scanner.nextLine();
                Drink drinks = d.getDrink(drink);
              System.out.println("succs add drink");
                a.addDrink(drinks);
                a.addPizza(c);
              System.out.println(a.getDrinks().toString());


            }
        }

    }

}