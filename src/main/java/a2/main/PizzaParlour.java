package a2.main;

import a2.delivery.DeliveryFactory;
import a2.Pizza.Pizza;
import a2.Pizza.PizzaFactory;
import a2.drink.Drink;
import a2.drink.DrinkFactory;
import a2.order.Order;
import a2.order.OrderManager;
import a2.topping.ToppingFactory;
import java.util.Scanner;

public class PizzaParlour {

  public static void main(String[] args) {

    System.out.println("Welcome to 301 Pizza!: ");
    PizzaFactory p = new PizzaFactory();
    DrinkFactory d = new DrinkFactory();
    ToppingFactory t = new ToppingFactory();
    OrderManager orderManager = new OrderManager();
    int countOrder = 0;

    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("What can I do for you");
      System.out.print("Submit a new order  /");
      System.out.print("Update existing order  /");
      System.out.print("cancel order   " + '\n' + '\n');
      System.out.println("type Submit/update/cancel to command the system");
      String options = scanner.nextLine();
      if (options.equalsIgnoreCase("Submit")) {
        Order order = new Order(countOrder);
        while(true) {
          System.out.println("Please enter the type of Pizza you want"+ '\n');
          System.out.println("pepperoni, margherita, vegetarian, Neapolitan");
          String pizza = scanner.nextLine();
          Pizza pizza_w = p.getPizza(pizza);
//          pizza_w.preparation();
          System.out.println(pizza_w.getName());
          while (true) {
            System.out.println("Choose the topping you like, enter exit to finish" + '\n');
            System.out.println("olives, tomatoes, mushrooms, jalapenos, chicken, beef, pepperoni");
            String topping = scanner.nextLine();
            if (!topping.equalsIgnoreCase("exit")) {
              pizza_w.addTopping(t.getTopping(topping));
              System.out.println("success added topping"+ '\n');
            } else {
              break;
            }

          }
          order.addPizza(pizza_w);
          System.out.println("Done! type continue to add one more, type exit to add drink ");
          String command = scanner.nextLine();
          if(command.equalsIgnoreCase("exit")) {
            break;
          }else if(command.equalsIgnoreCase("continue")) {
            continue;
          }

        }
        while (true) {
          System.out.println("Choose the drink you like, enter exit to finish"+ '\n');
          System.out.println("Coke, Diet Coke, Coke Zero, Pepsi, Diet Pepsi, Dr. Pepper, Water, Juice");
          String drink = scanner.nextLine();
          if (!drink.equalsIgnoreCase("exit")) {
            Drink drinks = d.getDrink(drink);
            order.addDrink(drinks);
            System.out.println("success added one drink" + '\n');
          } else {
            break;
          }
        }

        System.out.println("your order is done, your order number is " + countOrder + '\n' );
        countOrder++;
        orderManager.addOrderToList(order);
      } else if(options.equalsIgnoreCase("Cancel")){
        System.out.println("Please enter the order number to cancel the order");
        String id = scanner.nextLine();
        int id_real = Integer.parseInt(id);
        try{
          orderManager.cancelOrder(id_real);
          System.out.println("Success");
        }catch(Exception e){
          System.out.println("we can not find order number");
        }

      } else if(options.equalsIgnoreCase("update")) {
        System.out.println("Please enter the order number you want to update");

      }
      //choose delivery
      System.out.println("Delivery or Pickup");
      String command = scanner.nextLine();
      if(command=="Delivery"){
        //delivery food and choose delivery method:
        DeliveryFactory ubereat=new DeliveryFactory();
        System.out.println("Choose the kind of delivery method? Ubereat/Foodora/PizzaPalour");
        String delivery_method = scanner.nextLine();
        System.out.println("Please type your address that you want to deliver to:");
        String address = scanner.nextLine();
        ubereat.SetDelivery("Ubereat","home","coke",1);
      }



    }

  }

}