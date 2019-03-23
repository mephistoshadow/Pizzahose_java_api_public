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
        int countOrder = 0;


        Scanner scanner = new Scanner(System.in);
        while(true) {
          System.out.println("What can I do for you");
          System.out.print("Submit a new order  /");
          System.out.print("Update existing order  /");
          System.out.print("cancel order   " + '\n' + '\n');
          System.out.println("type Submit/update/cancel to command the system");
            String options = scanner.nextLine();
            if(options.equals("Submit")) {
                Order a = new Order(0);
                System.out.println("Please enter the type of Pizza you want");
                String pizza = scanner.nextLine();
                Pizza c = p.getPizza(pizza);
                System.out.println(c.getName());
                System.out.println("success add a pizza");
                while(true) {
                  System.out.println("Choose the topping you like, enter exit to finish");
                  String topping = scanner.nextLine();
                  if(!topping.equals("exit")) {
                    c.addTopping(t.getTopping(topping));
                    System.out.println("succs add topping");
                  }else{
                    break;
                  }

                }
              while(true) {
                System.out.println("Choose the drink you like, enter exit to finish");
                String drink = scanner.nextLine();
                if(!drink.equals("exit")) {
                  Drink drinks = d.getDrink(drink);
                  a.addDrink(drinks);
                  System.out.println("success add one drink");
                }else{
                  break;
                }
              }
              a.addPizza(c);
              System.out.println("your order is done" + '\n' + '\n');



            }

          countOrder++;
        }

    }

}