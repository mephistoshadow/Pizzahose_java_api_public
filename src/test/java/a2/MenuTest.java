package a2;
import a2.Pizza.Pizza;
import a2.items.*;
import a2.topping.Olives;
import a2.topping.Topping;
import a2.topping.ToppingFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;
import a2.Pizza.PizzaFactory;
import a2.drink.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class MenuTest {
    @Test
    public void testSetFilePath() {
        System.out.println(System.getProperty("user.dir")+"/menu.json");
        Menu df=new Menu(System.getProperty("user.dir")+"/menu.json");

        df.setFile(System.getProperty("user.dir")+"/menu.json");
        String file=df.getFile();
        Assert.assertEquals(file,System.getProperty("user.dir")+"/menu.json");
    }
    @Test
    public void testGetFilePath() {
        Menu df=new Menu(System.getProperty("user.dir")+"/menu.json");
        String file=df.getFile();
        Assert.assertEquals(file,System.getProperty("user.dir")+"/menu.json");
    }

    @Test
    public void testChangeToppingPrice() {
        Olives olive=new Olives();
        Menu df=new Menu(System.getProperty("user.dir")+"/menu.json");
        df.changeToppingPrice("olives",1.2);
        Double price =df.getToppingPrice("olives",olive);
        Assert.assertEquals((Double) 1.2,price);

    }
    @Test
    public void testChangePizzaPrice() {
        PizzaFactory pf=new PizzaFactory();
        Pizza p=pf.getPizza("pepperoni");
        Menu df=new Menu(System.getProperty("user.dir")+"/menu.json");
        df.changePizzaPrice("pepperoni small", 10.0);
        Double price =df.getPizzaPrice("pepperoni small",p);
        Assert.assertEquals((Double) 10.0,price);

    }

    @Test
    public void testChangeDrinkPrice() {
        DrinkFactory pf=new DrinkFactory();
        Drink p=pf.getDrink("Pepsi");
        Menu df=new Menu(System.getProperty("user.dir")+"/menu.json");
        df.changeDrinkPrice("Pepsi", 1.0);
        Double price =df.getDrinkPrice("Pepsi",p);
        Assert.assertEquals((Double) 1.0,price);

    }
    @Test
    public void testAddNewPizza() {
        Menu df=new Menu(System.getProperty("user.dir")+"/menu.json");
        df.addNewPizza("p",12.1);
        Pizza p = new Pizza();
        p.setPrice(12.1);
        p.setName("p");
        Double price =df.getPizzaPrice("p",p);
        Assert.assertEquals((Double) 12.1,price);
    }

    @Test
    public void testSaveMenu() {
        Menu df=new Menu(System.getProperty("user.dir")+"/menu.json");
        df.SaveMenu();
        File file = new File(System.getProperty("user.dir")+"/menu.json");
        JSONParser jsonParser = new JSONParser();
        String detail="";
        DrinkFactory drinkf= new DrinkFactory();
        PizzaFactory pizzaf= new PizzaFactory();
        ToppingFactory toppingf = new ToppingFactory();
        try {
            FileReader reader = new FileReader(file);
            //Read JSON file
            JSONObject obj =(JSONObject) jsonParser.parse(reader);
            JSONObject PizzaJson=(JSONObject) obj.get("Pizza");
            JSONObject DrinkJson=(JSONObject) obj.get("Drink");
            JSONObject ToppingJson=(JSONObject) obj.get("Topping");

            Set keys  = DrinkJson.keySet();
            Iterator<String> iteraterD=keys.iterator();
            //set drinks
            while (iteraterD.hasNext()){
                String name =iteraterD.next();
                Double priceL=(Double) DrinkJson.get(name);
                double price = priceL.doubleValue();
                Drink drink=drinkf.getDrink(name);
                Double prices =df.getDrinkPrice(name,drink);
                Assert.assertEquals((Double) prices,(Double) price);
            }

            Set keysP  = PizzaJson.keySet();
            Iterator<String> iteraterP=keysP.iterator();
            //test pizza
            while (iteraterP.hasNext()){
                String name =iteraterP.next();
                Double price=(Double) PizzaJson.get(name);
                Pizza pizza=pizzaf.getPizza(name.split(" ")[0]);

                Double prices =df.getPizzaPrice(name,pizza);
                Assert.assertEquals( prices, price);

            }

            Set keysT  = ToppingJson.keySet();
            Iterator<String> iteraterT=keysT.iterator();
            while (iteraterT.hasNext()){
                String name =iteraterT.next();
                Double price=(Double) ToppingJson.get(name);
                Topping topping=toppingf.getTopping(name);
                Double prices=df.getToppingPrice(name,topping);
                Assert.assertEquals( prices, price);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        df.getMenu();

    }

}

