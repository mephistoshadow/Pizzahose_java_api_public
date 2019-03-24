package a2.main;

import a2.Pizza.Pizza;
import a2.Pizza.PizzaFactory;
import a2.drink.Drink;
import a2.drink.DrinkFactory;
import a2.delivery.DeliveryFactory;
import a2.delivery.*;
import a2.items.Menu;
import a2.order.Order;
import a2.order.OrderManager;
import a2.topping.Topping;
import a2.topping.ToppingFactory;
import java.util.Scanner;

public class PizzaParlour {

  public static void main(String[] args) {

    System.out.println("Welcome to 301 Pizza!: ");
    PizzaFactory p = new PizzaFactory();
    DrinkFactory d = new DrinkFactory();
    ToppingFactory t = new ToppingFactory();
    DeliveryFactory Delivery = new DeliveryFactory();
    OrderManager orderManager = new OrderManager();
    int countOrder = 0;
    String path = System.getProperty("user.dir") +"/menu.json";
    Menu menu = new Menu(path);

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
        while (true) {
          System.out.println("Please enter the type of Pizza you want" + '\n');
          System.out.println("pepperoni, margherita, vegetarian, Neapolitan");
          String pizza = scanner.nextLine();
          Pizza pizza_w = p.getPizza(pizza);
          System.out.println("what size you want" + '\n');
          System.out.println("large / small");
          String size = scanner.nextLine();
          String item = pizza + " " + size;
          pizza_w.setSize(size);
          menu.getPizzaPrice(item,pizza_w);
//          pizza_w.preparation();
//          System.out.println(pizza_w.getName());
          while (true) {
            System.out.println("Choose the topping you like, enter exit to finish" + '\n');
            System.out.println("olives, tomatoes, mushrooms, jalapenos, chicken, beef, pepperoni");
            String topping = scanner.nextLine();
            if (!topping.equalsIgnoreCase("exit")) {
              Topping to = t.getTopping(topping);
              menu.getToppingPrice(topping,to);
              pizza_w.addTopping(to);
              System.out.println("success added topping" + '\n');
            } else {
              break;
            }

          }
          order.addPizza(pizza_w);
          System.out.println("Done! type continue to add one more, type exit to add drink ");
          String command = scanner.nextLine();
          if (command.equalsIgnoreCase("exit")) {
            break;
          } else if (command.equalsIgnoreCase("continue")) {
            continue;
          }

        }
        while (true) {
          System.out.println("Choose the drink you like, enter exit to finish" + '\n');
          System.out
              .println("Coke, Diet Coke, Coke Zero, Pepsi, Diet Pepsi, Dr. Pepper, Water, Juice");
          String drink = scanner.nextLine();
          if (!drink.equalsIgnoreCase("exit")) {
            Drink drinks = d.getDrink(drink);
            menu.getDrinkPrice(drink,drinks);
            order.addDrink(drinks);
          } else {
            break;
          }
        }
        double price = order.calculatePrice();
        System.out.println("your order is done, your order number is " + countOrder + '\n');
        System.out.println("total price is " + price + '\n');
        countOrder++;
        orderManager.addOrderToList(order);
        System.out.print(order.printPizzaAndTopping());
      } else if (options.equalsIgnoreCase("Cancel")) {
        System.out.println("Please enter the order number to cancel the order");
        String id = scanner.nextLine();
        int id_real = Integer.parseInt(id);
        try {
          orderManager.cancelOrder(id_real);
          System.out.println("Success");
        } catch (Exception e) {
          System.out.println("we can not find order number");
        }

      } else if (options.equalsIgnoreCase("update")) {
        while (true) {
          System.out.println("Please enter the order number you want to update, type exit to exit");
          String id = scanner.nextLine();
          if (!id.equalsIgnoreCase("exit")) {
            int id_real = Integer.parseInt(id);
            System.out.println("what you want to update" + '\n');
            System.out.println("delete/add");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("delete")) {
              System.out.println("what you want to update" + '\n');
              System.out.println("Orders pizza / drinks / topping");
              String option = scanner.nextLine();
              if (option.equalsIgnoreCase("pizza")) {
                System.out.println("what pizza you want to delete" + '\n');
                System.out.println(
                    "pepperoni, margherita, vegetarian, Neapolitan");
                String pizza = scanner.nextLine();
                orderManager.deleteOrderPizza(id_real, pizza);
                System.out
                    .println("now the price is" + orderManager.getSepcificPrice(id_real) + '\n');
                System.out.println("successfully delete the order's pizza" + '\n');
              } else if (option.equalsIgnoreCase("drinks")) {
                System.out.println("what drink you want to delete" + '\n');
                System.out.println(
                    "Coke, Diet Coke, Coke Zero, Pepsi, Diet Pepsi, Dr. Pepper, Water, Juice");
                String drink = scanner.nextLine();
                orderManager.deleteOrderDrink(id_real, drink);
                System.out
                    .println("now the price is" + orderManager.getSepcificPrice(id_real) + '\n');
                System.out.println("successfully clear the order's drink" + '\n');
              } else if (option.equalsIgnoreCase("topping")) {
                System.out.println(
                    "what pizza you want to change" + '\n');
                System.out.println(
                    "pepperoni, margherita, vegetarian, Neapolitan");
                String pizza_w = scanner.nextLine();
                System.out.println("what topping you want to delete" + '\n');
                System.out.println(
                    "olives, tomatoes, mushrooms, jalapenos, chicken, beef, pepperoni");
                String topping = scanner.nextLine();
                orderManager.deleteOrderTopping(id_real, pizza_w, topping);
                System.out
                    .println("now the price is" + orderManager.getSepcificPrice(id_real) + '\n');
                System.out.println("successfully remove the order's topping" + '\n');
              }

            } else if (command.equalsIgnoreCase("add")) {
              System.out.println("what you want to update" + '\n');
              System.out.println("Orders pizza / drinks / topping");
              String option = scanner.nextLine();
              if (option.equalsIgnoreCase("pizza")) {
                System.out.println("what pizza you want to add" + '\n');
                System.out.println(
                    "pepperoni, margherita, vegetarian, Neapolitan");
                String pizza = scanner.nextLine();
                Pizza pizza_new = p.getPizza(pizza);
                System.out.println("what size you want" + '\n');
                System.out.println("large / small");
                String size = scanner.nextLine();
                String item = pizza + " " + size;
                pizza_new.setSize(size);
                menu.getPizzaPrice(item,pizza_new);
                orderManager.addOrderPizza(id_real, pizza_new);
                System.out
                    .println("now the price is" + orderManager.getSepcificPrice(id_real) + '\n');
                System.out.println("successfully add the order's pizza" + '\n');
              } else if (option.equalsIgnoreCase("drinks")) {
                System.out.println("what drink you want to delete" + '\n');
                System.out.println(
                    "Coke, Diet Coke, Coke Zero, Pepsi, Diet Pepsi, Dr. Pepper, Water, Juice");
                String drink = scanner.nextLine();
                Drink drink_new = d.getDrink(drink);
                menu.getDrinkPrice(drink,drink_new);
                orderManager.addOrderDrink(id_real, drink_new);
                System.out
                    .println("now the price is" + orderManager.getSepcificPrice(id_real) + '\n');
                System.out.println("successfully add the order's drink" + '\n');
              } else if (option.equalsIgnoreCase("topping")) {
                System.out.println(
                    "what pizza you want to change" + '\n');
                System.out.println(
                    "pepperoni, margherita, vegetarian, Neapolitan");
                String pizza_w = scanner.nextLine();
                System.out.println("what topping you want to delete" + '\n');
                System.out.println(
                    "olives, tomatoes, mushrooms, jalapenos, chicken, beef, pepperoni");
                String topping = scanner.nextLine();
                Topping topping_new = t.getTopping(topping);
                menu.getToppingPrice(topping,topping_new);
                orderManager.addOrderTopping(id_real, pizza_w, topping_new);
                System.out
                    .println("now the price is" + orderManager.getSepcificPrice(id_real) + '\n');
                System.out.println("successfully add the order's topping" + '\n');
              }
            }
          } else {
            break;
          }

        }
      }
      else if (options.equalsIgnoreCase("delivery")){
          System.out.println("choose you delivery method:Ubereat/Foodora/PizzaPalour");
          String method = scanner.nextLine();
          System.out.println(
                             "Please type in your address");
          String address = scanner.nextLine();
          List<Order> orders=orderManager.getOrderList();
          String details="";
          for (int i = 0; i < orders.size(); i++) {
              if (orders.get(i).getId() == countOrder) {
                  orders.get(i).getPizza();
                  
              }
          }
          Delivery.SetDelivery( method, address,  details, countOrder);
          
          
      }

    }

  }

}
